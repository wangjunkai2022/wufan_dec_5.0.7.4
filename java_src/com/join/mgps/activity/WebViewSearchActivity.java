package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.flipboard.bottomsheet.custom.SimpleSheetView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.LJWebView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.dto.DownloadCfg;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
@EActivity(R.layout.activity_web_view_search)
/* loaded from: classes.dex */
public class WebViewSearchActivity extends BaseFragmentActivity {
    CountDownTimer A;
    ImageView C;
    ScrollTextViewLayout D;
    TextView E;
    LinearLayout F;
    TextView G;
    ImageView H;
    ImageView I;
    Animation J;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    BottomSheetLayout f38417e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f38418f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f38419g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    View f38420h;
    @Pref

    /* renamed from: i  reason: collision with root package name */
    PrefDef_ f38421i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LJWebView f38422j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    View f38423k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    View f38424l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f38425m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f38426n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ImageView f38427o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    ImageView f38428p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    View f38429q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f38430r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f38431s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    String f38432t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    DownloadTask f38433u;

    /* renamed from: v  reason: collision with root package name */
    DownloadCfg f38434v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f38435w;

    /* renamed from: y  reason: collision with root package name */
    private String f38437y;

    /* renamed from: z  reason: collision with root package name */
    SimpleSheetView f38438z;

    /* renamed from: b  reason: collision with root package name */
    private String f38414b = getClass().getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private final String f38415c = "downloadc94873e7a457ef607a0cb27c7036b0e2";

    /* renamed from: d  reason: collision with root package name */
    private final String f38416d = "downloadc94873e7a457ef607a0cb27c7036b0e3";

    /* renamed from: x  reason: collision with root package name */
    private boolean f38436x = true;
    boolean B = false;
    private int K = 0;
    private int L = 0;
    List<DownloadTask> M = new ArrayList();
    Map<String, DownloadTask> N = new ConcurrentHashMap();

    /* loaded from: classes4.dex */
    class a implements SimpleSheetView.d {
        a() {
        }

        @Override // com.flipboard.bottomsheet.custom.SimpleSheetView.d
        public void a(SimpleSheetView.c cVar) {
            DownloadTask F = p1.f.K().F(WebViewSearchActivity.this.f38433u.getCrc_link_type_val());
            if (F != null) {
                if (F.getStatus() != 1 && F.getStatus() != 2) {
                    if (F.getStatus() == 5) {
                        com.join.mgps.Util.l2.a(WebViewSearchActivity.this).b("下载已完成");
                    }
                } else {
                    com.join.mgps.Util.l2.a(WebViewSearchActivity.this).b("已创建下载任务");
                }
            }
            WebViewSearchActivity webViewSearchActivity = WebViewSearchActivity.this;
            com.php25.PDownload.d.c(webViewSearchActivity.f38433u, webViewSearchActivity.f38438z.getContext());
            WebViewSearchActivity.this.f38417e.r();
        }

        @Override // com.flipboard.bottomsheet.custom.SimpleSheetView.d
        public void b(SimpleSheetView.c cVar) {
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(WebViewSearchActivity.this);
            a5.b("onItemClicked " + cVar.f12902a);
        }

        @Override // com.flipboard.bottomsheet.custom.SimpleSheetView.d
        public void onClose() {
            WebViewSearchActivity.this.f38417e.r();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f38441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j4, long j5, boolean z4) {
            super(j4, j5);
            this.f38441a = z4;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            WebViewSearchActivity.this.f38431s.setVisibility(8);
            WebViewSearchActivity.this.F0();
            if (WebViewSearchActivity.this.f38438z.getMixins().size() > 0) {
                WebViewSearchActivity webViewSearchActivity = WebViewSearchActivity.this;
                webViewSearchActivity.f38438z.setTitle(webViewSearchActivity.getResources().getString(R.string.sniffing_result_sheet_title, Integer.valueOf(WebViewSearchActivity.this.f38438z.getMixins().size())));
                WebViewSearchActivity webViewSearchActivity2 = WebViewSearchActivity.this;
                webViewSearchActivity2.f38417e.I(webViewSearchActivity2.f38438z);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            if (this.f38441a || j4 > 600) {
                return;
            }
            WebViewSearchActivity.this.f38431s.setText(R.string.sniffing_unfound);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity.this.downloadLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public class f {
        public f() {
        }

        @JavascriptInterface
        public void processHtml(String str) {
            String queryParameter = Uri.parse(WebViewSearchActivity.this.f38432t).getQueryParameter("word");
            WebViewSearchActivity webViewSearchActivity = WebViewSearchActivity.this;
            if (webViewSearchActivity.w0(webViewSearchActivity.f38432t) && !TextUtils.isEmpty(queryParameter)) {
                WebViewSearchActivity.this.n0(str);
                return;
            }
            WebViewSearchActivity webViewSearchActivity2 = WebViewSearchActivity.this;
            if (webViewSearchActivity2.x0(webViewSearchActivity2.f38432t)) {
                WebViewSearchActivity.this.l0(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class g extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        Context f38446a;

        public g(Context context) {
            this.f38446a = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String str2 = WebViewSearchActivity.this.f38414b;
            com.join.mgps.Util.v0.b(str2, "onPageFinished() called." + str);
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                WebViewSearchActivity.this.f38432t = str;
            }
            if (!WebViewSearchActivity.this.f38432t.equals("data:text/html,chromewebdata") && !WebViewSearchActivity.this.f38435w) {
                webView.getSettings().setBlockNetworkImage(false);
                if (WebViewSearchActivity.this.f38436x && WebViewSearchActivity.this.f38431s.getVisibility() != 0) {
                    Uri.parse(WebViewSearchActivity.this.f38432t).getHost();
                    String queryParameter = Uri.parse(WebViewSearchActivity.this.f38432t).getQueryParameter("word");
                    WebViewSearchActivity webViewSearchActivity = WebViewSearchActivity.this;
                    boolean z4 = true;
                    if (!webViewSearchActivity.w0(webViewSearchActivity.f38432t) || TextUtils.isEmpty(queryParameter)) {
                        WebViewSearchActivity webViewSearchActivity2 = WebViewSearchActivity.this;
                        if (!webViewSearchActivity2.x0(webViewSearchActivity2.f38432t)) {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        return;
                    }
                    WebViewSearchActivity.this.f38431s.setText(R.string.sniffing);
                    WebViewSearchActivity.this.f38431s.setVisibility(0);
                    WebViewSearchActivity.this.f38424l.setVisibility(0);
                    WebViewSearchActivity.this.f38422j.w("javascript:wufan.processHtml(document.documentElement.outerHTML);");
                    WebViewSearchActivity.this.f38436x = false;
                }
                WebViewSearchActivity.this.E0();
                return;
            }
            WebViewSearchActivity.this.G0();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String str2 = WebViewSearchActivity.this.f38414b;
            com.join.mgps.Util.v0.b(str2, "onPageStarted() called." + str);
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                WebViewSearchActivity.this.f38432t = str;
            }
            WebViewSearchActivity.this.showLoading();
            WebViewSearchActivity.this.E0();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            String str3 = WebViewSearchActivity.this.f38414b;
            com.join.mgps.Util.v0.b(str3, "onReceivedError() called." + str2);
            WebViewSearchActivity.this.f38435w = true;
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            WebViewSearchActivity.this.G0();
            WebViewSearchActivity.this.E0();
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
            com.join.mgps.Util.v0.b(WebViewSearchActivity.this.f38414b, "shouldOverrideUrlLoading() called.");
            if (com.join.android.app.common.utils.j.j(this.f38446a)) {
                if (!str.startsWith("weixin:")) {
                    if (!str.startsWith(com.facebook.common.util.f.f10923a) && !str.startsWith("https") && !str.startsWith("file://")) {
                        try {
                            WebViewSearchActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        return true;
                    }
                    WebViewSearchActivity.this.f38432t = str;
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                try {
                    WebViewSearchActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            } else {
                com.join.mgps.Util.l2.a(this.f38446a).b(WebViewSearchActivity.this.getString(R.string.net_connect_failed));
            }
            return true;
        }
    }

    private void A0(String str) {
        com.join.mgps.Util.v0.b(this.f38414b, "lodeWebView() called.");
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                LJWebView lJWebView = this.f38422j;
                if (lJWebView == null) {
                    return;
                }
                lJWebView.setVisibility(0);
                this.f38422j.setBarHeight(getResources().getDimensionPixelOffset(R.dimen.web_loding_progress_h));
                this.f38422j.setClickable(true);
                this.f38422j.setUseWideViewPort(true);
                this.f38422j.setSupportZoom(false);
                this.f38422j.setBuiltInZoomControls(false);
                this.f38422j.setJavaScriptEnabled(true);
                this.f38422j.setCacheMode(-1);
                this.f38422j.setWebViewClient(new g(this));
                this.f38422j.s(new f());
                this.f38422j.w(str);
            } else {
                G0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v0() {
        this.E = (TextView) findViewById(R.id.biground);
        this.F = (LinearLayout) findViewById(R.id.downloadLayout);
        this.G = (TextView) findViewById(R.id.scroll_text);
        this.D = (ScrollTextViewLayout) findViewById(R.id.scroll_text_layout);
        this.C = (ImageView) findViewById(R.id.hasNewFinishedGameImage);
        this.H = (ImageView) findViewById(R.id.downloadLine);
        this.I = (ImageView) findViewById(R.id.imageLoading);
        this.F.setOnClickListener(new d());
        getdownloadTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f38431s.getVisibility() == 0) {
            this.f38422j.setClickable(false);
        } else if (this.f38422j.getWebView().canGoForward()) {
            this.f38422j.getWebView().goForward();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        if (this.f38431s.getVisibility() == 0) {
            this.f38422j.setClickable(false);
        } else if (this.f38422j.getWebView().canGoBack()) {
            this.f38422j.getWebView().goBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        if (this.f38431s.getVisibility() == 0) {
            this.f38422j.setClickable(false);
        } else {
            this.f38422j.w(this.f38432t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        LJWebView lJWebView = this.f38422j;
        if (lJWebView == null) {
            return;
        }
        if (!lJWebView.getWebView().canGoBack()) {
            this.f38427o.setBackgroundResource(R.drawable.back_f1_disable);
        } else {
            this.f38427o.setBackgroundResource(R.drawable.back_f1);
        }
        if (!this.f38422j.getWebView().canGoForward()) {
            this.f38428p.setBackgroundResource(R.drawable.back_f2_disable);
        } else {
            this.f38428p.setBackgroundResource(R.drawable.back_f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        try {
            this.f38423k.setVisibility(8);
            this.f38424l.setVisibility(8);
            LJWebView lJWebView = this.f38422j;
            if (lJWebView != null) {
                lJWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        try {
            this.f38423k.setVisibility(0);
            this.f38424l.setVisibility(8);
            LJWebView lJWebView = this.f38422j;
            if (lJWebView != null) {
                lJWebView.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0() {
        if (this.f38438z.getMixins().size() > 0) {
            p0();
        } else {
            q0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void I0() {
        if (this.f38431s.getVisibility() == 0) {
            this.f38422j.setClickable(false);
        } else if (!com.join.android.app.common.utils.j.j(this)) {
            com.join.mgps.Util.l2.a(this).b(getResources().getString(R.string.net_connect_failed));
            q0(false);
        } else {
            this.f38431s.setText(R.string.sniffing);
            this.f38431s.setVisibility(0);
            this.f38424l.setVisibility(0);
            if (TextUtils.isEmpty(this.f38432t)) {
                q0(false);
                return;
            }
            try {
                String queryParameter = Uri.parse(this.f38432t).getQueryParameter("word");
                if (w0(this.f38432t) && !TextUtils.isEmpty(queryParameter) && queryParameter.equals(this.f38437y)) {
                    this.f38438z.getMixins().clear();
                    m0(this.f38432t);
                } else if (x0(this.f38432t)) {
                    this.f38438z.getMixins().clear();
                    o0(this.f38432t);
                } else {
                    q0(false);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        if (!TextUtils.isEmpty(this.f38432t)) {
            this.f38437y = Uri.parse(this.f38432t).getQueryParameter("word");
        }
        this.f38434v = com.join.mgps.pref.h.n(this).w().getSniffer_down_load_domain();
        this.f38438z = new SimpleSheetView(this, getResources().getString(R.string.sniffing_result_sheet_title, 0), new a());
        this.f38424l.setOnTouchListener(new b());
        Iterator<TipBean> it2 = this.f38433u.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            String id = next.getId();
            if (!id.equals(ConstantIntEnum.DATA.value() + "")) {
                String id2 = next.getId();
                if (!id2.equals(ConstantIntEnum.OBB.value() + "")) {
                    String id3 = next.getId();
                    if (id3.equals(ConstantIntEnum.OBBDATA.value() + "")) {
                    }
                }
            }
            this.B = true;
        }
        com.join.mgps.Util.d0.a().d(this);
        v0();
        this.f38419g.setText(this.f38432t);
        A0(this.f38432t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkDownlodingNumber() {
        this.K = p1.f.K().S();
        this.L = p1.f.K().W(this);
        updateLine(p1.f.K().a0());
        int i4 = this.K;
        if (i4 != 0) {
            updateDownloadingPoint(i4);
        } else if (this.L != 0) {
            updateNoOpenPoint();
        } else {
            updateHidePoint();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    void downloadLayout() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
        this.D.p();
        this.I.setVisibility(8);
        this.f38421i.isNewFinishedGame().g(Boolean.FALSE);
        this.C.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getdownloadTask() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.M = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.M) {
            if (downloadTask.getCrc_link_type_val() != null) {
                this.N.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    void k0(String str) {
        try {
            Document r02 = r0(str);
            Elements elements = null;
            if (Build.VERSION.SDK_INT >= 30 && this.B) {
                elements = r02.select("a#downloadc94873e7a457ef607a0cb27c7036b0e3");
            }
            if (elements == null || elements.size() <= 0) {
                elements = r02.select("a#downloadc94873e7a457ef607a0cb27c7036b0e2");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Element> it2 = elements.iterator();
            while (it2.hasNext()) {
                Element next = it2.next();
                String attr = next.attr(ForumGroupMemberActivity_.f30403u);
                String attr2 = next.attr("abs:href");
                String substring = attr2.substring(attr2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                StringBuilder sb = new StringBuilder();
                sb.append("acquirePackage href=");
                sb.append(next.attr("abs:href"));
                sb.append(" gid=");
                sb.append(next.attr(ForumGroupMemberActivity_.f30403u));
                sb.append(" text=");
                sb.append(next.text());
                DownloadTask downloadTask = this.f38433u;
                if (downloadTask != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && com.join.mgps.Util.x0.d(this.f38433u.getCrc_link_type_val()).equals(attr)) {
                    SimpleSheetView.c cVar = new SimpleSheetView.c(attr, substring, "来源：" + str);
                    cVar.d(str);
                    cVar.c(attr2);
                    arrayList.add(cVar);
                }
            }
            this.f38438z.getMixins().addAll(arrayList);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(String str) {
        Document parse = Jsoup.parse(str);
        Elements select = (Build.VERSION.SDK_INT < 30 || !this.B) ? null : parse.select("a#downloadc94873e7a457ef607a0cb27c7036b0e3");
        if (select == null || select.size() <= 0) {
            select = parse.select("a#downloadc94873e7a457ef607a0cb27c7036b0e2");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it2 = select.iterator();
        while (it2.hasNext()) {
            Element next = it2.next();
            String attr = next.attr(ForumGroupMemberActivity_.f30403u);
            String attr2 = next.attr("abs:href");
            String substring = attr2.substring(attr2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
            StringBuilder sb = new StringBuilder();
            sb.append("acquirePackage href=");
            sb.append(next.attr("abs:href"));
            sb.append(" gid=");
            sb.append(next.attr(ForumGroupMemberActivity_.f30403u));
            sb.append(" text=");
            sb.append(next.text());
            DownloadTask downloadTask = this.f38433u;
            if (downloadTask != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && com.join.mgps.Util.x0.d(this.f38433u.getCrc_link_type_val()).equals(attr)) {
                SimpleSheetView.c cVar = new SimpleSheetView.c(attr, substring, "来源：" + this.f38432t);
                cVar.d(this.f38432t);
                cVar.c(attr2);
                arrayList.add(cVar);
            }
        }
        this.f38438z.setMixins(arrayList);
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0(String str) {
        try {
            List<String> u02 = u0(r0(str));
            for (int i4 = 0; i4 < u02.size(); i4++) {
                k0(u02.get(i4));
            }
            H0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        List<String> u02 = u0(Jsoup.parse(str));
        for (int i4 = 0; i4 < u02.size(); i4++) {
            k0(u02.get(i4));
        }
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(String str) {
        k0(str);
        H0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                updateUI(a5, 1);
                return;
            case 3:
                updateUI(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                updateUI(a5, 5);
                return;
            case 6:
                updateUI(a5, 6);
                return;
            case 7:
                a5.setStatus(7);
                updateUI(a5, 3);
                return;
            case 8:
                updateUI(a5, 4);
                return;
            case 10:
                if (a5 == null) {
                    return;
                }
                updateUI(a5, 7);
                return;
            case 12:
                updateUI(a5, 8);
                return;
            case 13:
                updateUI(a5, 9);
                return;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && this.f38422j.getWebView().canGoBack()) {
            this.f38422j.getWebView().goBack();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkDownlodingNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        q0(true);
    }

    void q0(boolean z4) {
        c cVar = new c(3000L, 200L, z4);
        this.A = cVar;
        cVar.start();
    }

    Document r0(String str) {
        new HashMap();
        Connection connect = Jsoup.connect(str);
        try {
            return connect.header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; XX; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/68.0.3440.91 Mobile Safari/537.36").get();
        } catch (IOException e5) {
            e5.printStackTrace();
            try {
                return connect.get();
            } catch (IOException e6) {
                e6.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.M.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.N.remove(next.getCrc_link_type_val());
                it2.remove();
                List<DownloadTask> R = p1.f.K().R(null);
                if (R != null && R.size() == 0) {
                    this.f38421i.isNewFinishedGame().g(Boolean.FALSE);
                    this.C.setVisibility(8);
                }
                checkDownlodingNumber();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveStart(DownloadTask downloadTask, int i4) {
        UtilsMy.A4(this.M);
        Map<String, DownloadTask> map = this.N;
        if (map == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.M.add(downloadTask);
            this.N.put(downloadTask.getCrc_link_type_val(), downloadTask);
            this.D.setTextArray(new String[]{"", "size", "", "size"});
            this.D.setIsStop(false);
            this.D.n();
            checkDownlodingNumber();
        } else if (i4 != 1 && i4 != 7) {
            if (downloadTask.getStatus() == 3 || downloadTask.getStatus() == 6) {
                checkDownlodingNumber();
            }
        } else {
            checkDownlodingNumber();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.N;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.M.add(downloadTask);
            this.N.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.N.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        checkDownlodingNumber();
        this.f38421i.isNewFinishedGame().g(Boolean.TRUE);
        this.C.setVisibility(0);
    }

    String s0(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Elements select = r0(str).select("noscript > META[content]");
            if (select != null) {
                Element first = select.first();
                Matcher matcher = Pattern.compile("(?=http).*?(?=('|$))", 2).matcher(first.attr("content"));
                if (matcher.find() && matcher.groupCount() > 0) {
                    str2 = matcher.group(0);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getRedirectUrl1 text=");
                sb.append(first.attr("content"));
                sb.append(" url=");
                sb.append(str2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return str2;
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        com.join.mgps.Util.c2.o(this, -1, true);
    }

    @UiThread
    public void showLoading() {
        try {
            this.f38419g.setText(this.f38432t);
            this.f38424l.setVisibility(8);
            this.f38424l.setClickable(false);
            this.f38423k.setVisibility(8);
            LJWebView lJWebView = this.f38422j;
            if (lJWebView != null) {
                lJWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void startLineAnimation() {
        this.H.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.img_translate);
        this.J = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.I.setVisibility(0);
        this.I.startAnimation(this.J);
        this.J.setAnimationListener(new e());
    }

    void stopLineAnimation() {
        this.I.clearAnimation();
        this.I.setVisibility(8);
        this.H.setImageResource(R.drawable.line_grey_bg);
    }

    String t0(String str) {
        String str2 = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(5000);
            str2 = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            return str2;
        } catch (IOException e5) {
            e5.printStackTrace();
            return str2;
        }
    }

    List<String> u0(Document document) {
        ArrayList arrayList = new ArrayList();
        Elements select = document.select("div.result");
        if (select == null) {
            select = document.select("a[href]");
        }
        Iterator<Element> it2 = select.iterator();
        while (it2.hasNext()) {
            Element first = it2.next().select("a[href]").first();
            if (first != null) {
                String s02 = s0(first.attr("abs:href"));
                String host = Uri.parse(s02).getHost();
                StringBuilder sb = new StringBuilder();
                sb.append("queryLinksByDomain href=");
                sb.append(first.attr("abs:href"));
                sb.append(" \ntext=");
                sb.append(first.text());
                sb.append(" \nredirect=");
                sb.append(s02);
                sb.append(" \nhost=");
                sb.append(host);
                if (x0(s02)) {
                    arrayList.add(s02);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadingPoint(int i4) {
        this.E.setVisibility(0);
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.E.setLayoutParams(layoutParams);
            this.E.setCompoundDrawables(null, null, null, null);
            this.E.setBackgroundResource(R.drawable.mygame_big_round);
            this.E.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            this.E.setGravity(17);
            this.E.setLayoutParams(layoutParams2);
            this.E.setCompoundDrawables(null, null, null, null);
            this.E.setBackgroundResource(R.drawable.message_round);
            this.E.setPadding(1, 0, 2, 1);
        }
        TextView textView = this.E;
        textView.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateHidePoint() {
        stopLineAnimation();
        this.E.setVisibility(8);
        this.E.setText("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateLine(int i4) {
        this.D.setDrawable(getResources().getDrawable(R.drawable.papa_download_selector));
        if (i4 == 0) {
            stopLineAnimation();
            return;
        }
        this.H.setImageResource(R.drawable.line_blue_bg);
        startLineAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateNoOpenPoint() {
        stopLineAnimation();
        this.E.setVisibility(8);
        this.E.setText("");
        Drawable drawable = getResources().getDrawable(R.drawable.mygame_litle_round);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    receiveDelete(downloadTask);
                    return;
                } else if (i4 == 5) {
                    receiveSuccess(downloadTask);
                    return;
                } else if (i4 != 7 && i4 != 8 && i4 != 9) {
                    return;
                }
            }
            receiveStart(downloadTask, i4);
        }
    }

    boolean w0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(www|m).baidu.com").matcher(Uri.parse(str).getHost()).find();
    }

    boolean x0(String str) {
        DownloadCfg downloadCfg;
        if (TextUtils.isEmpty(str) || (downloadCfg = this.f38434v) == null || TextUtils.isEmpty(downloadCfg.getCfg_values())) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        return Pattern.compile("(^|,)" + host).matcher(this.f38434v.getCfg_values()).find();
    }

    boolean y0() {
        return this.f38431s.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        A0(this.f38432t);
    }
}
