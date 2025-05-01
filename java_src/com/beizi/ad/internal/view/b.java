package com.beizi.ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Pair;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.c.d;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.utilities.DeviceInfo;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.UserEnvInfo;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.lance.a.i;
import com.beizi.ad.lance.a.m;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.LinkedList;
import java.util.List;
/* compiled from: BeiZiImplementation.java */
/* loaded from: classes2.dex */
class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(AdWebView adWebView, String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if ("GotoPage".equals(host)) {
            a(adWebView, parse);
        } else if ("SendMsg".equals(host)) {
            b(adWebView, parse);
        } else if ("CallNo".equals(host)) {
            c(adWebView, parse);
        } else if ("ClosePage".equals(host)) {
            d(adWebView, parse);
        } else if ("GetDeviceID".equals(host)) {
            e((WebView) adWebView, parse);
        } else if ("Download".equals(host)) {
            e(adWebView, parse);
        } else if ("PingClick".equals(host)) {
            f(adWebView, parse);
        } else if ("PingConvertion".equals(host)) {
            g(adWebView, parse);
        } else if ("GetCommonInfo".equals(host)) {
            a((WebView) adWebView, parse);
        } else if ("MayDeepLink".equals(host)) {
            b((WebView) adWebView, parse);
        } else if ("DeepLink".equals(host)) {
            if (adWebView.getUserInteraction()) {
                c((WebView) adWebView, parse);
            } else {
                HaoboLog.w(HaoboLog.jsLogTag, HaoboLog.getString(R.string.no_user_interaction, str));
            }
        } else if ("ExternalBrowser".equals(host)) {
            if (adWebView.getUserInteraction()) {
                d((WebView) adWebView, parse);
            } else {
                HaoboLog.w(HaoboLog.jsLogTag, HaoboLog.getString(R.string.no_user_interaction, str));
            }
        } else if ("InternalBrowser".equals(host)) {
            if (adWebView.getUserInteraction()) {
                h(adWebView, parse);
            } else {
                HaoboLog.w(HaoboLog.jsLogTag, HaoboLog.getString(R.string.no_user_interaction, str));
            }
        } else if ("RecordEvent".equals(host)) {
            i(adWebView, parse);
        } else if ("DispatchAppEvent".equals(host)) {
            j(adWebView, parse);
        } else if ("GetDeviceID".equals(host)) {
            e((WebView) adWebView, parse);
        } else {
            String str2 = HaoboLog.baseLogTag;
            HaoboLog.w(str2, "BeiZiSDK called with unsupported function: " + host);
        }
    }

    private static void b(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        uri.getQueryParameter("msg");
        uri.getQueryParameter("receiver");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "SendMsg"));
        linkedList.add(new Pair("success", String.valueOf(false)));
        a(adWebView, queryParameter, linkedList);
    }

    private static void c(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        uri.getQueryParameter("receiver");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "CallNo"));
        linkedList.add(new Pair("success", String.valueOf(false)));
        a(adWebView, queryParameter, linkedList);
    }

    private static void d(final AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        adWebView.adViewImpl.getMyHandler().post(new Runnable() { // from class: com.beizi.ad.internal.view.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (AdWebView.this.adViewImpl.e()) {
                    AdWebView.this.adViewImpl.getAdDispatcher().b();
                    Activity activity = (Activity) AdWebView.this.getContextFromMutableContext();
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    activity.finish();
                    return;
                }
                AdWebView.this.d();
            }
        });
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "ClosePage"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        a(adWebView, queryParameter, linkedList);
    }

    private static void e(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter("cb");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter)));
            if (adWebView != null) {
                adWebView.getContext().startActivity(intent);
            }
        } catch (Exception unused) {
            Toast.makeText(adWebView.getContext(), R.string.action_cant_be_completed, 0).show();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "Download"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        a(adWebView, queryParameter2, linkedList);
    }

    private static void f(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter("cb");
        adWebView.adViewImpl.pingClick(queryParameter);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "PingClick"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        a(adWebView, queryParameter2, linkedList);
    }

    private static void g(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter("cb");
        adWebView.adViewImpl.pingConvert(queryParameter);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "PingConvertion"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        a(adWebView, queryParameter2, linkedList);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private static void h(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        if (adWebView.getContext() == null || queryParameter == null || !queryParameter.startsWith(com.facebook.common.util.f.f10923a)) {
            return;
        }
        String decode = Uri.decode(queryParameter);
        Class a5 = AdActivity.a();
        Intent intent = new Intent(adWebView.getContext(), a5);
        intent.putExtra("ACTIVITY_TYPE", "BROWSER");
        WebView webView = new WebView(adWebView.getContext());
        WebviewUtil.setWebViewSettings(webView);
        com.beizi.ad.internal.activity.a.f5750a.add(webView);
        webView.loadUrl(decode, i.a());
        if (adWebView.adViewImpl.getBrowserStyle() != null) {
            String str = "" + webView.hashCode();
            intent.putExtra("bridgeid", str);
            AdViewImpl.c.f6276a.add(new Pair<>(str, adWebView.adViewImpl.getBrowserStyle()));
        }
        try {
            adWebView.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(adWebView.getContext(), R.string.action_cant_be_completed, 0).show();
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
            com.beizi.ad.internal.activity.a.f5750a.remove();
        }
    }

    private static void i(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null || !queryParameter.startsWith(com.facebook.common.util.f.f10923a)) {
            return;
        }
        WebView webView = new WebView(adWebView.getContext());
        webView.setWebViewClient(new WebViewClient() { // from class: com.beizi.ad.internal.view.b.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                String str2 = HaoboLog.baseLogTag;
                HaoboLog.d(str2, "RecordEvent completed loading: " + str);
                CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
                if (cookieSyncManager != null) {
                    cookieSyncManager.sync();
                }
            }
        });
        webView.loadUrl(queryParameter, i.a());
        webView.setVisibility(8);
        adWebView.addView(webView);
    }

    private static void j(AdWebView adWebView, Uri uri) {
        adWebView.adViewImpl.getAdDispatcher().a(uri.getQueryParameter("event"), uri.getQueryParameter("data"));
    }

    private static void c(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        String queryParameter2 = uri.getQueryParameter("url");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "DeepLink"));
        if (webView.getContext() != null && queryParameter2 != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter2)));
                intent.setFlags(268435456);
                webView.getContext().startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                a(webView, queryParameter, linkedList);
                return;
            }
        }
        a(webView, queryParameter, linkedList);
    }

    private static void d(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        if (webView.getContext() == null || queryParameter == null || !queryParameter.startsWith(com.facebook.common.util.f.f10923a)) {
            return;
        }
        try {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter))));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(webView.getContext(), R.string.action_cant_be_completed, 0).show();
        }
    }

    private static void b(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        String queryParameter2 = uri.getQueryParameter("url");
        boolean z4 = false;
        if (webView.getContext() != null && webView.getContext().getPackageManager() != null && queryParameter2 != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter2)));
            intent.setFlags(268435456);
            if (intent.resolveActivity(webView.getContext().getPackageManager()) != null) {
                z4 = true;
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "MayDeepLink"));
        linkedList.add(new Pair("mayDeepLink", String.valueOf(z4)));
        a(webView, queryParameter, linkedList);
    }

    private static void e(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GetDeviceID"));
        linkedList.add(new Pair("idname", "imei"));
        a(webView, queryParameter, linkedList);
    }

    private static void a(AdWebView adWebView, Uri uri) {
        boolean z4;
        String queryParameter = uri.getQueryParameter("cb");
        if (adWebView.loadAdAt(Integer.parseInt(uri.getQueryParameter("index")))) {
            AdViewImpl adViewImpl = adWebView.adViewImpl;
            if (adViewImpl instanceof InterstitialAdViewImpl) {
                ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) adViewImpl).getAdImplementation()).g();
            }
            z4 = true;
        } else {
            z4 = false;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GotoPage"));
        linkedList.add(new Pair("success", String.valueOf(z4)));
        a(adWebView, queryParameter, linkedList);
    }

    private static void a(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        d.a a5 = new d.a.C0173a().a(deviceInfo.sdkUID).l(m.a(com.beizi.ad.internal.g.a().f5898i)).m(m.b(com.beizi.ad.internal.g.a().f5898i)).n(deviceInfo.bootMark).o(deviceInfo.updateMark).b("").c(deviceInfo.os).a(e.EnumC0174e.PLATFORM_ANDROID).a(deviceInfo.devType).d(deviceInfo.brand).e(deviceInfo.model).f(deviceInfo.manufacturer).g(deviceInfo.resolution).h(deviceInfo.screenSize).i(deviceInfo.language).p(deviceInfo.agVercode).a(deviceInfo.wxInstalled).q(DeviceInfo.physicalMemoryByte).r(DeviceInfo.harddiskSizeByte).a();
        UserEnvInfo userEnvInfo = UserEnvInfo.getInstance();
        d.c a6 = new d.c.a().a(userEnvInfo.f6108net).a(userEnvInfo.isp).a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GetDeviceID"));
        linkedList.add(new Pair("deviceInfo", Base64.encodeToString(a5.b(), 0)));
        linkedList.add(new Pair("userEnvInfo", Base64.encodeToString(a6.b(), 0)));
        a(webView, queryParameter, linkedList);
    }

    private static void a(WebView webView, String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("cb=");
        if (str == null) {
            str = "-1";
        }
        sb.append(str);
        if (list != null) {
            for (Pair<String, String> pair : list) {
                if (pair.first != null && pair.second != null) {
                    sb.append(m.a.f71490d);
                    sb.append((String) pair.first);
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(Uri.encode((String) pair.second));
                }
            }
        }
        String format = String.format("javascript:window.sdkjs.client.result(\"%s\")", sb.toString());
        if (Build.VERSION.SDK_INT >= 19) {
            webView.evaluateJavascript(format, null);
        } else {
            webView.loadUrl(format, i.a());
        }
    }
}
