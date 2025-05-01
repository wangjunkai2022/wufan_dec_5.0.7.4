package com.join.mgps.activity;

import android.content.Context;
import android.net.Uri;
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
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.BaseActivity;
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
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.EverdayLogin;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.PopupAdBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.WebAccountDataBean;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.home_popup_ad_activity)
/* loaded from: classes4.dex */
public class HomePopupAdActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f33946b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    MultiTouchViewPager f33947c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    CircleIndicator f33948d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f33949e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    EverdayLogin f33950f;

    /* renamed from: h  reason: collision with root package name */
    PopupAdBean f33952h;

    /* renamed from: i  reason: collision with root package name */
    DraweePagerAdapter f33953i;

    /* renamed from: n  reason: collision with root package name */
    Context f33958n;

    /* renamed from: o  reason: collision with root package name */
    private WebView f33959o;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    boolean f33951g = false;

    /* renamed from: j  reason: collision with root package name */
    boolean f33954j = false;

    /* renamed from: k  reason: collision with root package name */
    boolean f33955k = false;

    /* renamed from: l  reason: collision with root package name */
    private Handler f33956l = new Handler();

    /* renamed from: m  reason: collision with root package name */
    EverdayLogin f33957m = null;

    /* loaded from: classes4.dex */
    public class DraweePagerAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<Object> f33960a;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f33962b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AppBeanMain f33963c;

            a(Context context, AppBeanMain appBeanMain) {
                this.f33962b = context;
                this.f33963c = appBeanMain;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UtilsMy.X0(this.f33962b, this.f33963c);
                HomePopupAdActivity.this.finish();
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecomDatabean f33965b;

            b(RecomDatabean recomDatabean) {
                this.f33965b = recomDatabean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomePopupAdActivity.this.k0(view.getContext(), this.f33965b.getSub().get(0));
                HomePopupAdActivity.this.finish();
            }
        }

        /* loaded from: classes4.dex */
        class c extends WebChromeClient {
            c() {
            }
        }

        /* loaded from: classes4.dex */
        class d extends WebViewClient {
            d() {
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
            return this.f33960a;
        }

        public void c(List<Object> list) {
            this.f33960a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<Object> list = this.f33960a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            Uri parse;
            Object obj = this.f33960a.get(i4);
            if (obj instanceof RecomDatabean) {
                RecomDatabean recomDatabean = (RecomDatabean) obj;
                String pic_remote = recomDatabean.getMain().getPic_remote();
                Context context = viewGroup.getContext();
                View inflate = LayoutInflater.from(context).inflate(R.layout.home_popup_ad_item, (ViewGroup) null);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.adImage);
                TextView textView = (TextView) inflate.findViewById(R.id.downLoadView);
                simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
                com.facebook.drawee.backends.pipeline.e newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                if (HomePopupAdActivity.this.isHomePopupAdLocalCached(pic_remote)) {
                    parse = com.join.mgps.Util.l0.j(new File(com.join.mgps.Util.v.b(context), com.join.mgps.Util.h0.o(pic_remote)));
                } else {
                    parse = Uri.parse(pic_remote);
                }
                newDraweeControllerBuilder.a(parse);
                simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().a(Uri.parse(pic_remote)).E(true).build());
                simpleDraweeView.setClickable(true);
                try {
                    viewGroup.addView(inflate, -1, -1);
                    AppBeanMain appBeanMain = recomDatabean.getSub().get(0);
                    if (appBeanMain != null && appBeanMain.getLink_type() == 17) {
                        appBeanMain.setLink_type(1);
                        textView.setOnClickListener(new a(context, appBeanMain));
                    }
                    simpleDraweeView.setOnClickListener(new b(recomDatabean));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return inflate;
            } else if (obj instanceof EverdayLogin) {
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_popup_ad_everdaylogin, (ViewGroup) null);
                HomePopupAdActivity.this.f33959o = (WebView) inflate2.findViewById(R.id.webView);
                HomePopupAdActivity.this.f33959o.setBackgroundColor(0);
                HomePopupAdActivity.this.f33959o.getBackground().setAlpha(0);
                HomePopupAdActivity.this.f33959o.getSettings().setJavaScriptEnabled(true);
                HomePopupAdActivity.this.f33959o.loadUrl(((EverdayLogin) obj).getFilePath());
                HomePopupAdActivity.this.f33959o.setHorizontalScrollBarEnabled(false);
                HomePopupAdActivity.this.f33959o.setVerticalScrollBarEnabled(false);
                HomePopupAdActivity.this.f33959o.setWebChromeClient(new c());
                HomePopupAdActivity.this.f33959o.setWebViewClient(new d());
                HomePopupAdActivity.this.f33959o.addJavascriptInterface(new b(), "papa");
                HomePopupAdActivity.this.f33959o.setLayerType(1, null);
                UtilsMy.C3(HomePopupAdActivity.this.f33959o);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabean f33969b;

        a(RecomDatabean recomDatabean) {
            this.f33969b = recomDatabean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f33969b.getSub() == null || this.f33969b.getSub().size() <= 0) {
                return;
            }
            HomePopupAdActivity.this.k0(view.getContext(), this.f33969b.getSub().get(0));
        }
    }

    /* loaded from: classes4.dex */
    class b {

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f33972b;

            a(String str) {
                this.f33972b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentUtil.getInstance().intentActivity(HomePopupAdActivity.this.f33958n, (IntentDateBean) JsonMapper.getInstance().fromJson(this.f33972b, IntentDateBean.class));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        b() {
        }

        @JavascriptInterface
        public String getAccountVer2() {
            WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(HomePopupAdActivity.this).getAccountData();
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
                HomePopupAdActivity.this.f33957m.setHasGetGiftTime(System.currentTimeMillis());
                com.join.mgps.pref.h.n(HomePopupAdActivity.this).Y(JsonMapper.getInstance().toJson(HomePopupAdActivity.this.f33957m));
            }
        }

        @JavascriptInterface
        public int getint() {
            return 100222;
        }

        @JavascriptInterface
        public void startIntent(String str) {
            HomePopupAdActivity.this.f33956l.post(new a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        List<RecomDatabean> big_pic;
        EverdayLogin everdayLogin;
        this.f33958n = this;
        try {
            PopupAdBean popupAdBean = (PopupAdBean) JsonMapper.getInstance().fromJson(com.join.mgps.Util.g2.g(this.f33949e), PopupAdBean.class);
            this.f33952h = popupAdBean;
            if (popupAdBean != null && popupAdBean.getAd_switch().equals("1")) {
                this.f33954j = true;
            }
            if (!this.f33954j && !this.f33955k) {
                finish();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f33955k && (everdayLogin = this.f33957m) != null) {
                arrayList.add(everdayLogin);
            }
            if (this.f33954j && (big_pic = this.f33952h.getBig_pic()) != null) {
                arrayList.addAll(big_pic);
            }
            this.f33953i = new DraweePagerAdapter();
            if (arrayList.size() == 1) {
                this.f33948d.setVisibility(8);
            }
            this.f33953i.c(arrayList);
            this.f33947c.setAdapter(this.f33953i);
            this.f33948d.setViewPager(this.f33947c);
            if (this.f33954j) {
                try {
                    this.f33946b.getHierarchy().x(r.c.f11294a);
                    if (this.f33952h.getMore() != null && this.f33952h.getMore().size() > 0 && this.f33952h.getMore().get(0).getMain().getAd_switch() == 1) {
                        if (this.f33946b.getVisibility() != 0) {
                            this.f33946b.setVisibility(0);
                        }
                        RecomDatabean recomDatabean = this.f33952h.getMore().get(0);
                        this.f33946b.setOnClickListener(new a(recomDatabean));
                        MyImageLoader.h(this.f33946b, recomDatabean.getMain().getPic_remote());
                        return;
                    }
                    this.f33946b.setVisibility(8);
                    this.f33946b.setOnClickListener(null);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    boolean isHomePopupAdLocalCached(String str) {
        return new File(com.join.mgps.Util.v.b(this.f33958n), com.join.mgps.Util.h0.o(str)).exists();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.A})
    public void j0() {
        WebView webView = this.f33959o;
        if (webView != null) {
            webView.loadUrl("javascript:reloadEveryDayReceive()");
        }
    }

    public void k0(Context context, AppBeanMain appBeanMain) {
        if (appBeanMain == null) {
            return;
        }
        PopupAdBean popupAdBean = this.f33952h;
        if (popupAdBean != null && com.join.mgps.Util.g2.i(popupAdBean.getTag()) && "SP_001".equals(this.f33952h.getTag())) {
            com.papa.sim.statistic.p.l(context).p("fingerClickAdPop", "", AccountUtil_.getInstance_(context).getUid());
        }
        IntentDateBean intentDateBean = new IntentDateBean(appBeanMain.getLink_type(), appBeanMain.getJump_type(), appBeanMain.getLink_type_val(), appBeanMain.getCrc_link_type_val(), appBeanMain.getTpl_type(), null);
        intentDateBean.setExtBean(new ExtBean(13202));
        IntentUtil.getInstance().intentActivity(context, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        setResult(1);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
