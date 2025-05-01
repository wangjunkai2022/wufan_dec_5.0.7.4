package com.alipay.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final String f4962a = "com.alipay.android.app";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4963b = "com.eg.android.AlipayGphone";

    /* renamed from: c  reason: collision with root package name */
    private static final String f4964c = "7.0.0";

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f4965a;

        /* renamed from: b  reason: collision with root package name */
        public int f4966b;
    }

    private static int a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(Arrays.asList(str.split("\\.")));
        arrayList2.addAll(Arrays.asList(str2.split("\\.")));
        int max = Math.max(arrayList.size(), arrayList2.size());
        while (arrayList.size() < max) {
            arrayList.add("0");
        }
        while (arrayList2.size() < max) {
            arrayList2.add("0");
        }
        for (int i4 = 0; i4 < max; i4++) {
            if (Integer.parseInt((String) arrayList.get(i4)) != Integer.parseInt((String) arrayList2.get(i4))) {
                return Integer.parseInt((String) arrayList.get(i4)) - Integer.parseInt((String) arrayList2.get(i4));
            }
        }
        return 0;
    }

    public static WebView b(Activity activity, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            CookieSyncManager.createInstance(activity.getApplicationContext()).sync();
            CookieManager.getInstance().setCookie(str, str2);
            CookieSyncManager.getInstance().sync();
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        activity.setContentView(linearLayout, layoutParams);
        WebView webView = new WebView(activity);
        layoutParams.weight = 1.0f;
        webView.setVisibility(0);
        linearLayout.addView(webView, layoutParams);
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + o(activity));
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMinimumFontSize(settings.getMinimumFontSize() + 8);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        webView.setVerticalScrollbarOverlay(true);
        webView.setDownloadListener(new k(activity));
        if (Build.VERSION.SDK_INT >= 7) {
            try {
                Method method = webView.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
                if (method != null) {
                    method.invoke(webView.getSettings(), Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
        }
        try {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused2) {
                Method method2 = webView.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method2 != null) {
                    method2.invoke(webView, "searchBoxJavaBridge_");
                    method2.invoke(webView, "accessibility");
                    method2.invoke(webView, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused3) {
        }
        if (Build.VERSION.SDK_INT >= 19) {
            webView.getSettings().setCacheMode(1);
        }
        webView.loadUrl(str);
        return webView;
    }

    public static a c(Context context, String str) {
        for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(64)) {
            if (packageInfo.packageName.equals(str)) {
                a aVar = new a();
                aVar.f4965a = packageInfo.signatures[0].toByteArray();
                aVar.f4966b = packageInfo.versionCode;
                return aVar;
            }
        }
        return null;
    }

    public static String d() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String e(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int indexOf2 = TextUtils.isEmpty(str2) ? 0 : str3.indexOf(str2, indexOf);
            if (indexOf2 <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(byte[] bArr) {
        try {
            String obj = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey().toString();
            if (obj.indexOf("modulus") != -1) {
                return obj.substring(obj.indexOf("modulus") + 8, obj.lastIndexOf(",")).trim();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> g(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(m.a.f71490d)) {
            int indexOf = str2.indexOf(SimpleComparison.EQUAL_TO_OPERATION, 1);
            hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
        }
        return hashMap;
    }

    public static boolean h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f4962a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean i(PackageInfo packageInfo) {
        int i4 = packageInfo.applicationInfo.flags;
        return (i4 & 1) == 0 && (i4 & 128) == 0;
    }

    public static boolean j(WebView webView, String str, Activity activity) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!str.toLowerCase().startsWith(com.alipay.sdk.cons.a.f4820i.toLowerCase()) && !str.toLowerCase().startsWith(com.alipay.sdk.cons.a.f4821j.toLowerCase())) {
            if (!TextUtils.equals(str, com.alipay.sdk.cons.a.f4823l) && !TextUtils.equals(str, com.alipay.sdk.cons.a.f4824m)) {
                if (str.startsWith(com.alipay.sdk.cons.a.f4822k)) {
                    try {
                        String substring = str.substring(str.indexOf(com.alipay.sdk.cons.a.f4822k) + 24);
                        parseInt = Integer.parseInt(substring.substring(substring.lastIndexOf(com.alipay.sdk.cons.a.f4825n) + 10));
                    } catch (Exception unused) {
                        com.alipay.sdk.app.i a5 = com.alipay.sdk.app.i.a(com.alipay.sdk.app.i.PARAMS_ERROR.a());
                        com.alipay.sdk.app.h.f4713a = com.alipay.sdk.app.h.b(a5.a(), a5.b(), "");
                    }
                    if (parseInt != com.alipay.sdk.app.i.SUCCEEDED.a() && parseInt != com.alipay.sdk.app.i.PAY_WAITTING.a()) {
                        com.alipay.sdk.app.i a6 = com.alipay.sdk.app.i.a(com.alipay.sdk.app.i.FAILED.a());
                        com.alipay.sdk.app.h.f4713a = com.alipay.sdk.app.h.b(a6.a(), a6.b(), "");
                        activity.runOnUiThread(new l(activity));
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    String decode = URLDecoder.decode(str);
                    String substring2 = decode.substring(decode.indexOf(com.alipay.sdk.cons.a.f4822k) + 24, decode.lastIndexOf(com.alipay.sdk.cons.a.f4825n));
                    if (substring2.contains("&return_url=")) {
                        String str2 = substring2.split("&return_url=")[0];
                        int indexOf = substring2.indexOf("&return_url=") + 12;
                        sb.append(str2);
                        sb.append("&return_url=");
                        sb.append(substring2.substring(indexOf, substring2.indexOf(m.a.f71489c, indexOf)));
                        sb.append(substring2.substring(substring2.indexOf(m.a.f71489c, indexOf)));
                        substring2 = sb.toString();
                    }
                    com.alipay.sdk.app.i a7 = com.alipay.sdk.app.i.a(parseInt);
                    com.alipay.sdk.app.h.f4713a = com.alipay.sdk.app.h.b(a7.a(), a7.b(), substring2);
                    activity.runOnUiThread(new l(activity));
                    return true;
                }
                webView.loadUrl(str);
                return true;
            }
            com.alipay.sdk.app.h.f4713a = com.alipay.sdk.app.h.a();
            activity.finish();
            return true;
        }
        try {
            a c5 = c(activity, f4963b);
            if (c5 != null) {
                String f5 = f(c5.f4965a);
                if (f5 != null && !TextUtils.equals(f5, com.alipay.sdk.cons.a.f4819h)) {
                    com.alipay.sdk.app.statistic.a.c(com.alipay.sdk.app.statistic.c.f4729l, com.alipay.sdk.app.statistic.c.f4736s, f5);
                    return true;
                }
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst(com.alipay.sdk.cons.a.f4821j, com.alipay.sdk.cons.a.f4820i);
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static String k() {
        String p4 = p();
        int indexOf = p4.indexOf("-");
        if (indexOf != -1) {
            p4 = p4.substring(0, indexOf);
        }
        int indexOf2 = p4.indexOf("\n");
        if (indexOf2 != -1) {
            p4 = p4.substring(0, indexOf2);
        }
        return "Linux " + p4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        r6 = java.lang.Integer.parseInt((java.lang.String) r3.get(r0)) - java.lang.Integer.parseInt((java.lang.String) r4.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(android.content.Context r6) {
        /*
            java.lang.String r0 = "\\."
            r1 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r2 = "com.eg.android.AlipayGphone"
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            if (r6 != 0) goto L12
            return r1
        L12:
            java.lang.String r6 = r6.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r2 = "7.0.0"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String[] r6 = r6.split(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            r3.addAll(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String[] r6 = r2.split(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            r4.addAll(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r6 = r3.size()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r0 = r4.size()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r6 = java.lang.Math.max(r6, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
        L42:
            int r0 = r3.size()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r2 = "0"
            if (r0 >= r6) goto L4e
            r3.add(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            goto L42
        L4e:
            int r0 = r4.size()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            if (r0 >= r6) goto L58
            r4.add(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            goto L4e
        L58:
            r0 = 0
        L59:
            if (r0 >= r6) goto L8a
            java.lang.Object r2 = r3.get(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r2 = (java.lang.String) r2     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.Object r5 = r4.get(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r5 = (java.lang.String) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            if (r2 == r5) goto L87
            java.lang.Object r6 = r3.get(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r6 = (java.lang.String) r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.Object r0 = r4.get(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            java.lang.String r0 = (java.lang.String) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L90
            int r6 = r6 - r0
            goto L8b
        L87:
            int r0 = r0 + 1
            goto L59
        L8a:
            r6 = 0
        L8b:
            if (r6 >= 0) goto L8e
            return r1
        L8e:
            r6 = 1
            return r6
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.j.l(android.content.Context):boolean");
    }

    public static boolean m(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String n() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 24; i4++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String o(Context context) {
        String d5 = d();
        String k4 = k();
        String q4 = q(context);
        String s4 = s(context);
        return " (" + d5 + ";" + k4 + ";" + q4 + ";;" + s4 + ")(sdk android)";
    }

    private static String p() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (matcher.matches() && matcher.groupCount() >= 4) {
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            }
            return "Unavailable";
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String q(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    private static String r() {
        String str = com.alipay.sdk.cons.a.f4812a;
        return str.substring(0, str.indexOf("://"));
    }

    public static String s(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD + displayMetrics.heightPixels;
    }

    private static String t() {
        return "-1;-1";
    }

    public static String u(Context context) {
        String str = "";
        try {
            String str2 = "";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(f4963b)) {
                    str2 = str2 + "#M";
                } else if (runningAppProcessInfo.processName.startsWith("com.eg.android.AlipayGphone:")) {
                    str2 = str2 + "#" + runningAppProcessInfo.processName.replace("com.eg.android.AlipayGphone:", "");
                }
            }
            str = str2;
        } catch (Throwable unused) {
        }
        if (str.length() > 0) {
            str = str.substring(1);
        }
        return str.length() == 0 ? "N" : str;
    }

    private static DisplayMetrics v(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static String w(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < installedPackages.size(); i4++) {
            PackageInfo packageInfo = installedPackages.get(i4);
            int i5 = packageInfo.applicationInfo.flags;
            if ((i5 & 1) == 0 && (i5 & 128) == 0) {
                if (packageInfo.packageName.equals(f4963b)) {
                    sb.append(packageInfo.packageName);
                    sb.append(packageInfo.versionCode);
                    sb.append("-");
                } else if (!packageInfo.packageName.contains("theme") && !packageInfo.packageName.startsWith("com.google.") && !packageInfo.packageName.startsWith("com.android.")) {
                    sb.append(packageInfo.packageName);
                    sb.append("-");
                }
            }
        }
        return sb.toString();
    }
}
