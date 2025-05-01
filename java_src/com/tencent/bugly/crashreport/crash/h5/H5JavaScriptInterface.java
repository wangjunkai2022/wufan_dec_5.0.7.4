package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.common.util.f;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class H5JavaScriptInterface {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<Integer> f62450a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private String f62451b = null;

    /* renamed from: c  reason: collision with root package name */
    private Thread f62452c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f62453d = null;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f62454e = null;

    private H5JavaScriptInterface() {
    }

    private static a a(String str) {
        String string;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                String string2 = jSONObject.getString("projectRoot");
                aVar.f62455a = string2;
                if (string2 == null) {
                    return null;
                }
                String string3 = jSONObject.getString("context");
                aVar.f62456b = string3;
                if (string3 == null) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                aVar.f62457c = string4;
                if (string4 == null) {
                    return null;
                }
                String string5 = jSONObject.getString(TTDownloadField.TT_USERAGENT);
                aVar.f62458d = string5;
                if (string5 == null) {
                    return null;
                }
                String string6 = jSONObject.getString("language");
                aVar.f62459e = string6;
                if (string6 == null) {
                    return null;
                }
                String string7 = jSONObject.getString("name");
                aVar.f62460f = string7;
                if (string7 == null || string7.equals("null") || (string = jSONObject.getString("stacktrace")) == null) {
                    return null;
                }
                int indexOf = string.indexOf("\n");
                if (indexOf < 0) {
                    x.d("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                aVar.f62462h = string.substring(indexOf + 1);
                String substring = string.substring(0, indexOf);
                aVar.f62461g = substring;
                int indexOf2 = substring.indexOf(":");
                if (indexOf2 > 0) {
                    aVar.f62461g = aVar.f62461g.substring(indexOf2 + 1);
                }
                aVar.f62463i = jSONObject.getString(f.f10925c);
                if (aVar.f62460f == null) {
                    return null;
                }
                long j4 = jSONObject.getLong("lineNumber");
                aVar.f62464j = j4;
                if (j4 < 0) {
                    return null;
                }
                long j5 = jSONObject.getLong("columnNumber");
                aVar.f62465k = j5;
                if (j5 < 0) {
                    return null;
                }
                x.a("H5 crash information is following: ", new Object[0]);
                x.a("[projectRoot]: " + aVar.f62455a, new Object[0]);
                x.a("[context]: " + aVar.f62456b, new Object[0]);
                x.a("[url]: " + aVar.f62457c, new Object[0]);
                x.a("[userAgent]: " + aVar.f62458d, new Object[0]);
                x.a("[language]: " + aVar.f62459e, new Object[0]);
                x.a("[name]: " + aVar.f62460f, new Object[0]);
                x.a("[message]: " + aVar.f62461g, new Object[0]);
                x.a("[stacktrace]: \n" + aVar.f62462h, new Object[0]);
                x.a("[file]: " + aVar.f62463i, new Object[0]);
                x.a("[lineNumber]: " + aVar.f62464j, new Object[0]);
                x.a("[columnNumber]: " + aVar.f62465k, new Object[0]);
                return aVar;
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
        String str = null;
        if (webViewInterface == null || f62450a.contains(Integer.valueOf(webViewInterface.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f62450a.add(Integer.valueOf(webViewInterface.hashCode()));
        Thread currentThread = Thread.currentThread();
        h5JavaScriptInterface.f62452c = currentThread;
        if (currentThread != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            for (int i4 = 2; i4 < currentThread.getStackTrace().length; i4++) {
                StackTraceElement stackTraceElement = currentThread.getStackTrace()[i4];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
            str = sb.toString();
        }
        h5JavaScriptInterface.f62453d = str;
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) webViewInterface.getContentDescription());
        hashMap.put("[WebView] ContentDescription", sb2.toString());
        h5JavaScriptInterface.f62454e = hashMap;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        x.d("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            x.d("Payload from JS is null.", new Object[0]);
            return;
        }
        String a5 = z.a(str.getBytes());
        String str2 = this.f62451b;
        if (str2 != null && str2.equals(a5)) {
            x.d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f62451b = a5;
        x.d("Handling JS exception ...", new Object[0]);
        a a6 = a(str);
        if (a6 == null) {
            x.d("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = a6.f62455a;
        if (str3 != null) {
            linkedHashMap2.put("[JS] projectRoot", str3);
        }
        String str4 = a6.f62456b;
        if (str4 != null) {
            linkedHashMap2.put("[JS] context", str4);
        }
        String str5 = a6.f62457c;
        if (str5 != null) {
            linkedHashMap2.put("[JS] url", str5);
        }
        String str6 = a6.f62458d;
        if (str6 != null) {
            linkedHashMap2.put("[JS] userAgent", str6);
        }
        String str7 = a6.f62463i;
        if (str7 != null) {
            linkedHashMap2.put("[JS] file", str7);
        }
        long j4 = a6.f62464j;
        if (j4 != 0) {
            linkedHashMap2.put("[JS] lineNumber", Long.toString(j4));
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.putAll(this.f62454e);
        linkedHashMap.put("Java Stack", this.f62453d);
        InnerApi.postH5CrashAsync(this.f62452c, a6.f62460f, a6.f62461g, a6.f62462h, linkedHashMap);
    }
}
