package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomCircleProgressBar;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.EverdayLogin;
import com.join.mgps.dto.PopupAdBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.WebAccountDataBean;
import com.join.mgps.receiver.BootReceiver_;
import com.join.mgps.service.CommonService_;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.home_popup_adqw_activity)
/* loaded from: classes4.dex */
public class HomePopupAdQWActivity extends Activity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f33984b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    MultiTouchViewPager f33985c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    CircleIndicator f33986d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    CustomCircleProgressBar f33987e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f33988f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f33989g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f33990h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f33991i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    EverdayLogin f33992j;

    /* renamed from: l  reason: collision with root package name */
    PopupAdBean f33994l;

    /* renamed from: m  reason: collision with root package name */
    DraweePagerAdapter f33995m;

    /* renamed from: r  reason: collision with root package name */
    Context f34000r;

    /* renamed from: s  reason: collision with root package name */
    private WebView f34001s;

    /* renamed from: t  reason: collision with root package name */
    BootReceiver_ f34002t;

    /* renamed from: v  reason: collision with root package name */
    com.github.snowdream.android.app.downloader.c f34004v;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    boolean f33993k = false;

    /* renamed from: n  reason: collision with root package name */
    boolean f33996n = false;

    /* renamed from: o  reason: collision with root package name */
    boolean f33997o = false;

    /* renamed from: p  reason: collision with root package name */
    private Handler f33998p = new Handler();

    /* renamed from: q  reason: collision with root package name */
    EverdayLogin f33999q = null;

    /* renamed from: u  reason: collision with root package name */
    Handler f34003u = new b();

    /* loaded from: classes4.dex */
    public class DraweePagerAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<Object> f34005a;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomePopupAdQWActivity.this.finish();
            }
        }

        /* loaded from: classes4.dex */
        class b extends com.facebook.drawee.controller.b<com.facebook.imagepipeline.image.f> {
            b() {
            }

            @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
            /* renamed from: b */
            public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
                super.onFinalImageSet(str, fVar, animatable);
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f34009b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecomDatabean f34010c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f34011d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AppBeanMain f34012e;

            c(String str, RecomDatabean recomDatabean, Context context, AppBeanMain appBeanMain) {
                this.f34009b = str;
                this.f34010c = recomDatabean;
                this.f34011d = context;
                this.f34012e = appBeanMain;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f34009b.startsWith(com.facebook.common.util.f.f10923a)) {
                    HomePopupAdQWActivity.this.g(this.f34009b, this.f34010c.getMain().getSub_title());
                } else {
                    ((CommonService_.h2) CommonService_.S2(this.f34011d).extra("downGameId", this.f34012e.getCrc_link_type_val())).a();
                }
                HomePopupAdQWActivity.this.finish();
            }
        }

        /* loaded from: classes4.dex */
        class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f34014b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecomDatabean f34015c;

            d(String str, RecomDatabean recomDatabean) {
                this.f34014b = str;
                this.f34015c = recomDatabean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f34014b.startsWith(com.facebook.common.util.f.f10923a)) {
                    HomePopupAdQWActivity.this.g(this.f34014b, this.f34015c.getMain().getSub_title());
                    return;
                }
                HomePopupAdQWActivity.this.j(view.getContext(), this.f34015c.getSub().get(0));
                HomePopupAdQWActivity.this.finish();
            }
        }

        /* loaded from: classes4.dex */
        class e extends WebChromeClient {
            e() {
            }
        }

        /* loaded from: classes4.dex */
        class f extends WebViewClient {
            f() {
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
                webView.loadUrl(str);
                return true;
            }
        }

        public DraweePagerAdapter() {
        }

        public List<Object> b() {
            return this.f34005a;
        }

        public void c(List<Object> list) {
            this.f34005a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<Object> list = this.f34005a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            Uri parse;
            Object obj = this.f34005a.get(i4);
            if (obj instanceof RecomDatabean) {
                RecomDatabean recomDatabean = (RecomDatabean) obj;
                String pic_remote = recomDatabean.getMain().getPic_remote();
                Context context = viewGroup.getContext();
                View inflate = LayoutInflater.from(context).inflate(R.layout.home_popup_ad_item, (ViewGroup) null);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.adImage);
                TextView textView = (TextView) inflate.findViewById(R.id.downLoadView);
                HomePopupAdQWActivity.this.findViewById(R.id.close).setOnClickListener(new a());
                simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
                com.facebook.drawee.backends.pipeline.e newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                if (HomePopupAdQWActivity.this.k(pic_remote)) {
                    parse = com.join.mgps.Util.l0.j(new File(com.join.mgps.Util.v.b(HomePopupAdQWActivity.this), com.join.mgps.Util.h0.o(pic_remote)));
                } else {
                    parse = Uri.parse(pic_remote);
                }
                newDraweeControllerBuilder.a(parse);
                newDraweeControllerBuilder.c(simpleDraweeView.getController());
                newDraweeControllerBuilder.H(new b());
                simpleDraweeView.setController(newDraweeControllerBuilder.build());
                simpleDraweeView.setClickable(true);
                try {
                    viewGroup.addView(inflate, -1, -1);
                    AppBeanMain appBeanMain = recomDatabean.getSub().get(0);
                    String link_type_val = appBeanMain.getLink_type_val();
                    if (appBeanMain.getLink_type() == 17) {
                        appBeanMain.setLink_type(1);
                        textView.setOnClickListener(new c(link_type_val, recomDatabean, context, appBeanMain));
                    }
                    simpleDraweeView.setOnClickListener(new d(link_type_val, recomDatabean));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return inflate;
            } else if (obj instanceof EverdayLogin) {
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_popup_ad_everdaylogin, (ViewGroup) null);
                HomePopupAdQWActivity.this.f34001s = (WebView) inflate2.findViewById(R.id.webView);
                HomePopupAdQWActivity.this.f34001s.setBackgroundColor(0);
                HomePopupAdQWActivity.this.f34001s.getBackground().setAlpha(0);
                HomePopupAdQWActivity.this.f34001s.getSettings().setJavaScriptEnabled(true);
                HomePopupAdQWActivity.this.f34001s.loadUrl(((EverdayLogin) obj).getFilePath());
                HomePopupAdQWActivity.this.f34001s.setHorizontalScrollBarEnabled(false);
                HomePopupAdQWActivity.this.f34001s.setVerticalScrollBarEnabled(false);
                HomePopupAdQWActivity.this.f34001s.setWebChromeClient(new e());
                HomePopupAdQWActivity.this.f34001s.setWebViewClient(new f());
                HomePopupAdQWActivity.this.f34001s.addJavascriptInterface(new c(), "papa");
                UtilsMy.C3(HomePopupAdQWActivity.this.f34001s);
                viewGroup.addView(inflate2, -1, -1);
                return inflate2;
            } else {
                return new TextView(viewGroup.getContext());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(HomePopupAdQWActivity.this);
                HomePopupAdQWActivity homePopupAdQWActivity = HomePopupAdQWActivity.this;
                l02.w(homePopupAdQWActivity, homePopupAdQWActivity.f34004v.j());
            }
        }

        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(HomePopupAdQWActivity.this);
                HomePopupAdQWActivity homePopupAdQWActivity = HomePopupAdQWActivity.this;
                l02.w(homePopupAdQWActivity, homePopupAdQWActivity.f34004v.j());
                HomePopupAdQWActivity.this.f33987e.setProgress(100);
                HomePopupAdQWActivity.this.f33990h.setVisibility(0);
                HomePopupAdQWActivity.this.f33989g.setVisibility(0);
                HomePopupAdQWActivity.this.f33989g.setOnClickListener(new a());
            } else if (i4 == 2) {
                HomePopupAdQWActivity.this.f33987e.setProgress(1);
                HomePopupAdQWActivity.this.f33990h.setVisibility(0);
            } else if (i4 == 4) {
                com.join.mgps.Util.l2.a(HomePopupAdQWActivity.this.f34000r).b("下载失败");
            } else if (i4 != 5) {
            } else {
                HomePopupAdQWActivity.this.f33987e.setProgress(message.arg1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c {

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f34023b;

            a(String str) {
                this.f34023b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentUtil.getInstance().intentActivity(HomePopupAdQWActivity.this.f34000r, (IntentDateBean) JsonMapper.getInstance().fromJson(this.f34023b, IntentDateBean.class));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        c() {
        }

        @JavascriptInterface
        public String getAccountVer2() {
            WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(HomePopupAdQWActivity.this).getAccountData();
            if (accountData != null) {
                webAccountDataBean.setAccountBean(AccountBean.convert(accountData));
                webAccountDataBean.setHasLogin(true);
            } else {
                webAccountDataBean.setHasLogin(false);
            }
            return JsonMapper.getInstance().toJson(webAccountDataBean);
        }

        @JavascriptInterface
        public void getRewards(boolean z4) {
            if (z4) {
                HomePopupAdQWActivity.this.f33999q.setHasGetGiftTime(System.currentTimeMillis());
                com.join.mgps.pref.h.n(HomePopupAdQWActivity.this).Y(JsonMapper.getInstance().toJson(HomePopupAdQWActivity.this.f33999q));
            }
        }

        @JavascriptInterface
        public int getint() {
            return 100222;
        }

        @JavascriptInterface
        public void startIntent(String str) {
            HomePopupAdQWActivity.this.f33998p.post(new a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.A})
    public void d() {
        WebView webView = this.f34001s;
        if (webView != null) {
            webView.loadUrl("javascript:reloadEveryDayReceive()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void e() {
        List<RecomDatabean> big_pic;
        EverdayLogin everdayLogin;
        this.f34000r = this;
        try {
            this.f34002t = new BootReceiver_();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(BootReceiver_.f53984a);
            intentFilter.addAction(BootReceiver_.f53985b);
            intentFilter.addAction(BootReceiver_.f53987d);
            intentFilter.addAction(BootReceiver_.f53989f);
            intentFilter.addDataScheme("package");
            intentFilter.setPriority(Integer.MAX_VALUE);
            registerReceiver(this.f34002t, intentFilter);
            PopupAdBean popupAdBean = (PopupAdBean) JsonMapper.getInstance().fromJson(com.join.mgps.Util.g2.g(this.f33991i), PopupAdBean.class);
            this.f33994l = popupAdBean;
            if (popupAdBean != null && popupAdBean.getAd_switch().equals("1")) {
                this.f33996n = true;
            }
            if (!this.f33996n && !this.f33997o) {
                finish();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f33997o && (everdayLogin = this.f33999q) != null) {
                arrayList.add(everdayLogin);
            }
            if (this.f33996n && (big_pic = this.f33994l.getBig_pic()) != null) {
                arrayList.addAll(big_pic);
            }
            this.f33995m = new DraweePagerAdapter();
            if (arrayList.size() == 1) {
                this.f33986d.setVisibility(8);
            }
            this.f33995m.c(arrayList);
            this.f33985c.setAdapter(this.f33995m);
            this.f33986d.setViewPager(this.f33985c);
            if (this.f33996n) {
                try {
                    this.f33984b.getHierarchy().x(r.c.f11294a);
                    if (this.f33994l.getMore() != null && this.f33994l.getMore().size() > 0 && this.f33994l.getMore().get(0).getMain().getAd_switch() == 1) {
                        if (this.f33984b.getVisibility() != 0) {
                            this.f33984b.setVisibility(0);
                        }
                        this.f33984b.setOnClickListener(new a());
                        MyImageLoader.h(this.f33984b, this.f33994l.getMore().get(0).getMain().getPic_remote());
                        return;
                    }
                    this.f33984b.setVisibility(8);
                    this.f33984b.setOnClickListener(null);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72016o})
    public void f(Intent intent) {
        intent.getStringExtra("packageName");
        String stringExtra = intent.getStringExtra("actionFrom");
        if (stringExtra.equals(BootReceiver_.f53984a)) {
            if (this.f33990h.getVisibility() == 0) {
                finish();
            }
        } else if (stringExtra.equals(BootReceiver_.f53985b)) {
        } else {
            stringExtra.equals(BootReceiver_.f53987d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g(String str, String str2) {
        String i4 = i(str);
        String substring = i4.substring(i4.lastIndexOf(47) + 1);
        if (substring.length() > 15) {
            substring = substring.substring(0, 14);
        }
        TextView textView = this.f33988f;
        textView.setText(str2 + "正在下载");
        m(substring + "下载中");
        h(i4, substring);
    }

    void h(String str, String str2) {
        com.github.snowdream.android.app.downloader.c cVar = new com.github.snowdream.android.app.downloader.c(str, str2, com.join.mgps.Util.v.f28105e, 0L);
        this.f34004v = cVar;
        cVar.r(this.f34003u);
        this.f34004v.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String i(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Android"
            android.net.http.AndroidHttpClient r0 = android.net.http.AndroidHttpClient.newInstance(r0)
            org.apache.http.client.methods.HttpGet r1 = new org.apache.http.client.methods.HttpGet
            r1.<init>(r6)
            org.apache.http.HttpResponse r1 = r0.execute(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            org.apache.http.StatusLine r2 = r1.getStatusLine()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r2 = r2.getStatusCode()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r4 = "code:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r3.append(r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L4c
            java.lang.String r2 = "Location"
            org.apache.http.Header[] r1 = r1.getHeaders(r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r1 == 0) goto L4c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r2 <= 0) goto L4c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r2 = r2 + (-1)
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r1 = r1.getValue()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r6 = r5.i(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r0.close()
            return r6
        L44:
            r6 = move-exception
            goto L50
        L46:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L4f
        L4c:
            r0.close()
        L4f:
            return r6
        L50:
            if (r0 == 0) goto L55
            r0.close()
        L55:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.HomePopupAdQWActivity.i(java.lang.String):java.lang.String");
    }

    public void j(Context context, AppBeanMain appBeanMain) {
        if (appBeanMain == null) {
            return;
        }
        IntentUtil.getInstance().intentActivity(context, new IntentDateBean(appBeanMain.getLink_type(), appBeanMain.getJump_type(), appBeanMain.getLink_type_val(), appBeanMain.getCrc_link_type_val(), appBeanMain.getTpl_type(), null));
    }

    boolean k(String str) {
        return new File(com.join.mgps.Util.v.b(this), com.join.mgps.Util.h0.o(str)).exists();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l() {
        setResult(1);
        if (this.f33990h.getVisibility() == 8) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m(String str) {
        com.join.mgps.Util.l2.a(this.f34000r).b(str);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BootReceiver_ bootReceiver_ = this.f34002t;
        if (bootReceiver_ != null) {
            unregisterReceiver(bootReceiver_);
        }
    }
}
