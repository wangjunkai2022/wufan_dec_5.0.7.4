package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.b;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.BuglyBroadcastReceiver;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.crashreport.crash.d;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.q;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: BUGLY */
/* loaded from: classes.dex */
public class CrashReport {

    /* renamed from: a  reason: collision with root package name */
    private static Context f62196a;

    /* compiled from: BUGLY */
    /* loaded from: classes3.dex */
    public static class CrashHandleCallback extends BuglyStrategy.a {
    }

    /* compiled from: BUGLY */
    /* loaded from: classes.dex */
    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: c  reason: collision with root package name */
        private CrashHandleCallback f62198c;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
            return this.f62165a;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
            return this.f62166b;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i4) {
            this.f62165a = i4;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z4) {
            this.f62166b = z4;
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f62198c = crashHandleCallback;
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f62198c;
        }
    }

    /* compiled from: BUGLY */
    /* loaded from: classes3.dex */
    public interface WebViewInterface {
        void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str);

        CharSequence getContentDescription();

        String getUrl();

        void loadUrl(String str);

        void setJavaScriptEnabled(boolean z4);
    }

    public static void closeBugly() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else if (f62196a == null) {
        } else {
            BuglyBroadcastReceiver buglyBroadcastReceiver = BuglyBroadcastReceiver.getInstance();
            if (buglyBroadcastReceiver != null) {
                buglyBroadcastReceiver.unregister(f62196a);
            }
            closeCrashReport();
            com.tencent.bugly.crashreport.biz.b.a(f62196a);
            w a5 = w.a();
            if (a5 != null) {
                a5.b();
            }
        }
    }

    public static void closeCrashReport() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            c.a().d();
        }
    }

    public static void closeNativeReport() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            c.a().g();
        }
    }

    public static void enableBugly(boolean z4) {
        b.f62191a = z4;
    }

    public static void enableObtainId(Context context, boolean z4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (context == null) {
            String str2 = x.f62732a;
        } else {
            String str3 = x.f62732a;
            new StringBuilder("Enable identification obtaining? ").append(z4);
            com.tencent.bugly.crashreport.common.info.a.a(context).b(z4);
        }
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!b.f62191a) {
            String str = x.f62732a;
            return new HashSet();
        } else if (context == null) {
            String str2 = x.f62732a;
            return new HashSet();
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(context).x();
        }
    }

    public static String getAppChannel() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return "unknown";
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return "unknown";
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(f62196a).f62261l;
        }
    }

    public static String getAppID() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return "unknown";
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return "unknown";
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(f62196a).f();
        }
    }

    public static String getAppVer() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return "unknown";
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return "unknown";
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(f62196a).f62259j;
        }
    }

    public static String getBuglyVersion(Context context) {
        if (context == null) {
            x.d("Please call with context.", new Object[0]);
            return "unknown";
        }
        return com.tencent.bugly.crashreport.common.info.a.a(context).c();
    }

    public static String getDeviceID(Context context) {
        return com.tencent.bugly.crashreport.common.info.a.a(context).h();
    }

    public static Proxy getHttpProxy() {
        return com.tencent.bugly.proguard.a.b();
    }

    public static Map<String, String> getSdkExtraData() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return new HashMap();
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return null;
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(f62196a).B;
        }
    }

    public static String getUserData(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
            return "unknown";
        } else if (context == null) {
            String str3 = x.f62732a;
            return "unknown";
        } else if (z.a(str)) {
            return null;
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(context).h(str);
        }
    }

    public static int getUserDatasSize(Context context) {
        if (!b.f62191a) {
            String str = x.f62732a;
            return -1;
        } else if (context == null) {
            String str2 = x.f62732a;
            return -1;
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(context).w();
        }
    }

    public static String getUserId() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return "unknown";
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return "unknown";
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(f62196a).g();
        }
    }

    public static int getUserSceneTagId(Context context) {
        if (!b.f62191a) {
            String str = x.f62732a;
            return -1;
        } else if (context == null) {
            String str2 = x.f62732a;
            return -1;
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(context).A();
        }
    }

    public static void initCrashReport(Context context) {
        if (context == null) {
            return;
        }
        f62196a = context;
        b.a(CrashModule.getInstance());
        b.a(context);
    }

    public static boolean isLastSessionCrash() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return false;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
            return false;
        } else {
            return c.a().b();
        }
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread(), false);
    }

    public static void postException(Thread thread, int i4, String str, String str2, String str3, Map<String, String> map) {
        if (!b.f62191a) {
            String str4 = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str5 = x.f62732a;
        } else {
            d.a(thread, i4, str, str2, str3, map);
        }
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context == null || z.a(str) || z.a(str2)) {
            return;
        }
        String replace = str.replace("[a-zA-Z[0-9]]+", "");
        if (replace.length() > 100) {
            String str3 = x.f62732a;
            String.format("putSdkData key length over limit %d, will be cutted.", 50);
            replace = replace.substring(0, 50);
        }
        if (str2.length() > 500) {
            String str4 = x.f62732a;
            String.format("putSdkData value length over limit %d, will be cutted!", 200);
            str2 = str2.substring(0, 200);
        }
        com.tencent.bugly.crashreport.common.info.a.a(context).c(replace, str2);
        x.b(String.format("[param] putSdkData data: %s - %s", replace, str2), new Object[0]);
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!b.f62191a) {
            String str3 = x.f62732a;
        } else if (context == null) {
            String str4 = x.f62732a;
        } else if (str == null) {
            x.d("putUserData args key should not be null or empty", new Object[0]);
        } else if (str2 == null) {
            x.d("putUserData args value should not be null", new Object[0]);
        } else {
            if (str2.length() > 200) {
                x.d("user data value length over limit %d, it will be cutted!", 200);
                str2 = str2.substring(0, 200);
            }
            com.tencent.bugly.crashreport.common.info.a a5 = com.tencent.bugly.crashreport.common.info.a.a(context);
            if (a5.x().contains(str)) {
                NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
                if (nativeCrashHandler != null) {
                    nativeCrashHandler.putKeyValueToNative(str, str2);
                }
                com.tencent.bugly.crashreport.common.info.a.a(context).b(str, str2);
                x.c("replace KV %s %s", str, str2);
            } else if (a5.w() >= 50) {
                x.d("user data size is over limit %d, it will be cutted!", 50);
            } else {
                if (str.length() > 50) {
                    x.d("user data key length over limit %d , will drop this new key %s", 50, str);
                    str = str.substring(0, 50);
                }
                NativeCrashHandler nativeCrashHandler2 = NativeCrashHandler.getInstance();
                if (nativeCrashHandler2 != null) {
                    nativeCrashHandler2.putKeyValueToNative(str, str2);
                }
                com.tencent.bugly.crashreport.common.info.a.a(context).b(str, str2);
                x.b("[param] set user data: %s - %s", str, str2);
            }
        }
    }

    public static String removeUserData(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
            return "unknown";
        } else if (context == null) {
            String str3 = x.f62732a;
            return "unknown";
        } else if (z.a(str)) {
            return null;
        } else {
            x.b("[param] remove user data: %s", str);
            return com.tencent.bugly.crashreport.common.info.a.a(context).g(str);
        }
    }

    public static void setAppChannel(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
        } else if (context == null) {
            String str3 = x.f62732a;
        } else if (str == null) {
            String str4 = x.f62732a;
        } else {
            com.tencent.bugly.crashreport.common.info.a.a(context).f62261l = str;
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeAppChannel(str);
            }
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
        } else if (context == null) {
            String str3 = x.f62732a;
        } else if (str == null) {
            String str4 = x.f62732a;
        } else {
            com.tencent.bugly.crashreport.common.info.a.a(context).f62252c = str;
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeAppPackage(str);
            }
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
        } else if (context == null) {
            String str3 = x.f62732a;
        } else if (str == null) {
            String str4 = x.f62732a;
        } else {
            com.tencent.bugly.crashreport.common.info.a.a(context).f62259j = str;
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeAppVersion(str);
            }
        }
    }

    public static void setBuglyDbName(String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
            return;
        }
        String str3 = x.f62732a;
        new StringBuilder("Set Bugly DB name: ").append(str);
        q.f62682a = str;
    }

    public static void setContext(Context context) {
        f62196a = context;
    }

    public static void setCrashFilter(String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
            return;
        }
        String str3 = x.f62732a;
        new StringBuilder("Set crash stack filter: ").append(str);
        c.f62407n = str;
    }

    public static void setCrashRegularFilter(String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
            return;
        }
        String str3 = x.f62732a;
        new StringBuilder("Set crash stack filter: ").append(str);
        c.f62408o = str;
    }

    public static void setDeviceId(Context context, String str) {
        if (str != null) {
            com.tencent.bugly.crashreport.common.info.a.a(context).c(str);
        }
    }

    public static void setDeviceModel(Context context, String str) {
        if (str != null) {
            com.tencent.bugly.crashreport.common.info.a.a(context).d(str);
        }
    }

    public static void setHandleNativeCrashInJava(boolean z4) {
        if (!b.f62191a) {
            String str = x.f62732a;
            return;
        }
        String str2 = x.f62732a;
        new StringBuilder("Should handle native crash in Java profile after handled in native profile: ").append(z4);
        NativeCrashHandler.setShouldHandleInJava(z4);
    }

    public static void setHttpProxy(String str, int i4) {
        com.tencent.bugly.proguard.a.a(str, i4);
    }

    public static void setIsAppForeground(Context context, boolean z4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (context == null) {
            x.d("Context should not be null.", new Object[0]);
        } else {
            if (z4) {
                x.c("App is in foreground.", new Object[0]);
            } else {
                x.c("App is in background.", new Object[0]);
            }
            com.tencent.bugly.crashreport.common.info.a.a(context).a(z4);
        }
    }

    public static void setIsDevelopmentDevice(Context context, boolean z4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (context == null) {
            x.d("Context should not be null.", new Object[0]);
        } else {
            if (z4) {
                x.c("This is a development device.", new Object[0]);
            } else {
                x.c("This is not a development device.", new Object[0]);
            }
            com.tencent.bugly.crashreport.common.info.a.a(context).f62275z = z4;
        }
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z4) {
        return setJavascriptMonitor(webView, z4, false);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (!b.f62191a) {
            String str3 = x.f62732a;
        } else if (context == null || z.a(str) || z.a(str2)) {
        } else {
            com.tencent.bugly.crashreport.common.info.a.a(context).a(str, str2);
        }
    }

    public static void setServerUrl(String str) {
        if (!z.a(str) && z.c(str)) {
            com.tencent.bugly.crashreport.common.strategy.a.a(str);
            StrategyBean.f62279a = str;
            StrategyBean.f62280b = str;
            return;
        }
        String str2 = x.f62732a;
    }

    public static void setSessionIntervalMills(long j4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else {
            com.tencent.bugly.crashreport.biz.b.a(j4);
        }
    }

    public static void setUserId(String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str3 = x.f62732a;
        } else {
            setUserId(f62196a, str);
        }
    }

    public static void setUserSceneTag(Context context, int i4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (context == null) {
            String str2 = x.f62732a;
        } else {
            if (i4 <= 0) {
                x.d("setTag args tagId should > 0", new Object[0]);
            }
            com.tencent.bugly.crashreport.common.info.a.a(context).a(i4);
            x.b("[param] set user scene tag: %d", Integer.valueOf(i4));
        }
    }

    public static void startCrashReport() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            c.a().c();
        }
    }

    public static void testANRCrash() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            x.a("start to create a anr crash for test!", new Object[0]);
            c.a().l();
        }
    }

    public static void testJavaCrash() {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            com.tencent.bugly.crashreport.common.info.a b5 = com.tencent.bugly.crashreport.common.info.a.b();
            if (b5 != null) {
                b5.b(24096);
            }
            throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
        }
    }

    public static void testNativeCrash() {
        testNativeCrash(false, false, false);
    }

    public static void uploadUserInfo() {
        if (!b.f62191a) {
            String str = x.f62732a;
            return;
        }
        com.tencent.bugly.crashreport.biz.a aVar = com.tencent.bugly.crashreport.biz.b.f62231a;
        if (aVar == null) {
            String str2 = x.f62732a;
        } else {
            aVar.b();
        }
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    public static void setHttpProxy(InetAddress inetAddress, int i4) {
        com.tencent.bugly.proguard.a.a(inetAddress, i4);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z4, boolean z5) {
        if (webView == null) {
            String str = x.f62732a;
            return false;
        }
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setAllowFileAccess(false);
        return setJavascriptMonitor(new WebViewInterface() { // from class: com.tencent.bugly.crashreport.CrashReport.1
            @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
            public final void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str2) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str2);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
            public final CharSequence getContentDescription() {
                return webView.getContentDescription();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
            public final String getUrl() {
                return webView.getUrl();
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
            public final void loadUrl(String str2) {
                webView.loadUrl(str2);
            }

            @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
            public final void setJavaScriptEnabled(boolean z6) {
                WebSettings settings = webView.getSettings();
                if (settings.getJavaScriptEnabled()) {
                    return;
                }
                settings.setJavaScriptEnabled(true);
            }
        }, z4, z5);
    }

    public static void testNativeCrash(boolean z4, boolean z5, boolean z6) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else {
            x.a("start to create a native crash for test!", new Object[0]);
            c.a().a(z4, z5, z6);
        }
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z4) {
        if (!b.f62191a) {
            String str = x.f62732a;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            String str2 = x.f62732a;
        } else if (th == null) {
            x.d("throwable is null, just return", new Object[0]);
        } else {
            if (thread == null) {
                thread = Thread.currentThread();
            }
            c.a().a(thread, th, false, (String) null, (byte[]) null, z4);
        }
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f62196a = context;
        b.a(CrashModule.getInstance());
        b.a(context, userStrategy);
    }

    public static void postException(int i4, String str, String str2, String str3, Map<String, String> map) {
        postException(Thread.currentThread(), i4, str, str2, str3, map);
    }

    public static void setUserId(Context context, String str) {
        if (!b.f62191a) {
            String str2 = x.f62732a;
        } else if (context == null) {
            String str3 = x.f62732a;
        } else if (TextUtils.isEmpty(str)) {
            x.d("userId should not be null", new Object[0]);
        } else {
            if (str.length() > 100) {
                String substring = str.substring(0, 100);
                x.d("userId %s length is over limit %d substring to %s", str, 100, substring);
                str = substring;
            }
            if (str.equals(com.tencent.bugly.crashreport.common.info.a.a(context).g())) {
                return;
            }
            com.tencent.bugly.crashreport.common.info.a.a(context).b(str);
            x.b("[user] set userId : %s", str);
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setNativeUserId(str);
            }
            if (CrashModule.getInstance().hasInitialized()) {
                com.tencent.bugly.crashreport.biz.b.a();
            }
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!b.f62191a) {
            String str = x.f62732a;
            return new HashMap();
        } else if (context == null) {
            x.d("Context should not be null.", new Object[0]);
            return null;
        } else {
            return com.tencent.bugly.crashreport.common.info.a.a(context).B;
        }
    }

    public static void initCrashReport(Context context, String str, boolean z4) {
        if (context != null) {
            f62196a = context;
            b.a(CrashModule.getInstance());
            b.a(context, str, z4, null);
        }
    }

    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z4) {
        return setJavascriptMonitor(webViewInterface, z4, false);
    }

    public static void initCrashReport(Context context, String str, boolean z4, UserStrategy userStrategy) {
        if (context == null) {
            return;
        }
        f62196a = context;
        b.a(CrashModule.getInstance());
        b.a(context, str, z4, userStrategy);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z4, boolean z5) {
        if (webViewInterface == null) {
            String str = x.f62732a;
            return false;
        } else if (!CrashModule.getInstance().hasInitialized()) {
            x.e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        } else {
            x.a("Set Javascript exception monitor of webview.", new Object[0]);
            if (!b.f62191a) {
                String str2 = x.f62732a;
                return false;
            }
            x.c("URL of webview is %s", webViewInterface.getUrl());
            if (!z5 && Build.VERSION.SDK_INT < 19) {
                x.e("This interface is only available for Android 4.4 or later.", new Object[0]);
                return false;
            }
            x.a("Enable the javascript needed by webview monitor.", new Object[0]);
            webViewInterface.setJavaScriptEnabled(true);
            H5JavaScriptInterface h5JavaScriptInterface = H5JavaScriptInterface.getInstance(webViewInterface);
            if (h5JavaScriptInterface != null) {
                x.a("Add a secure javascript interface to the webview.", new Object[0]);
                webViewInterface.addJavascriptInterface(h5JavaScriptInterface, "exceptionUploader");
            }
            if (z4) {
                x.a("Inject bugly.js(v%s) to the webview.", com.tencent.bugly.crashreport.crash.h5.b.b());
                String a5 = com.tencent.bugly.crashreport.crash.h5.b.a();
                if (a5 == null) {
                    x.e("Failed to inject Bugly.js.", com.tencent.bugly.crashreport.crash.h5.b.b());
                    return false;
                }
                webViewInterface.loadUrl("javascript:" + a5);
            }
            return true;
        }
    }
}
