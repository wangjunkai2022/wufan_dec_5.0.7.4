package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bykv.vv.vv.vv.vv.b;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginInstallListener;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.download.PluginDownloadBean;
import com.bytedance.pangle.log.IZeusLogger;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.join.mgps.Util.h0;
import com.join.mgps.dto.Constant;
import com.tencent.cos.common.COSHttpResponseKey;
import com.umeng.analytics.pro.bm;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class o {

    /* renamed from: i  reason: collision with root package name */
    private static volatile BaseDexClassLoader f8714i;
    private static volatile TTPluginListener jh;
    private final Context wv;
    private static final String vv = "next" + File.separator;

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap<String, TTPluginListener> f8715m = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private static final HashMap<String, Handler> f8717p = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private static volatile o f8716o = null;

    /* renamed from: u  reason: collision with root package name */
    private final CountDownLatch f8721u = new CountDownLatch(1);

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f8720n = false;
    private volatile String qv = "none";

    /* renamed from: k  reason: collision with root package name */
    private JSONObject f8719k = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    private EventListener f8718b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class m implements IZeusLogger {
        private m() {
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void e(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.p.p(str, str2, th);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void i(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.p.p(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void v(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.p.vv(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.p.i(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.p.m(str, str2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p implements EventListener, Serializable {
        private void vv(vv vvVar) {
            try {
                if (TextUtils.isEmpty(vvVar.mPackageName) || !vvVar.mPackageName.equals("com.byted.pangle")) {
                    return;
                }
                o.vv(TTAppContextHolder.getContext()).m();
            } catch (Exception unused) {
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.EventListener
        public ValueSet onEvent(int i4, Result result) {
            a b5 = a.b();
            if (i4 == 1) {
                com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin update start");
                ValueSet values = result.values();
                if (values == null) {
                    com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "valueSet empty");
                    return null;
                }
                String stringValue = values.stringValue(3);
                int code = result.code();
                if (result.isSuccess()) {
                    vv i5 = o.i(values.stringValue(2));
                    if (i5 != null && !TextUtils.isEmpty(i5.mPackageName)) {
                        com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin update received: " + i5.mPackageName);
                        com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin update received: " + i5.mPackageName);
                        if (i5.isRevert()) {
                            com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin revert " + i5.mPackageName);
                            Zeus.unInstallPlugin(i5.mPackageName);
                        } else {
                            vv(i5);
                            com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin install");
                            if (o.m(i5)) {
                                b5.j(4, true);
                            }
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin update received with invalid config");
                        com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin update received with invalid config");
                        return null;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.api.plugin.m.vv("plugin_download", "plugin update received failed");
                    com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin update received failed");
                    o.p(stringValue, code);
                    return null;
                }
            }
            return b5.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class vv extends PluginDownloadBean {
        public String vv = "";

        /* renamed from: m  reason: collision with root package name */
        public File f8724m = null;

        vv() {
            this.mBackupUrlList = null;
        }
    }

    private o(Context context) {
        this.wv = context.getApplicationContext();
        try {
            GlobalParam.getInstance().closeHookHuaweiOnInit(true);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Unexpected error for closeHookHuaweiOnInit.", th);
        }
        m(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vv i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return vv(new JSONObject(str));
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.api.p.o("TTPluginManager", "Invalid plugin info:".concat(String.valueOf(str)));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        Plugin plugin = Zeus.getPlugin(str, false);
        try {
            if (plugin.mClassLoader != null) {
                TTAdSdk.getAdManager().register(a.c(3).f(0, 1).i(1, str).h(2, plugin.mClassLoader).a());
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.p.vv("TTPluginManager", "initPluginService failed in ".concat(String.valueOf(str)), th);
        }
    }

    private void m(Context context) {
        try {
            IZeusReporter iZeusReporter = new IZeusReporter() { // from class: com.bytedance.sdk.openadsdk.api.plugin.o.1
                @Override // com.bytedance.pangle.log.IZeusReporter
                public void report(String str, JSONObject jSONObject) {
                    if ("load_finish".equals(str) && jSONObject != null && "com.byted.pangle".endsWith(jSONObject.optString("plugin_package_name"))) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("duration", jSONObject.opt("duration"));
                            jSONObject2.put("message", jSONObject.opt("message"));
                            o.this.f8719k.put("zeus", jSONObject2);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (TTAdSdk.isInitSuccess()) {
                        com.bytedance.sdk.openadsdk.api.plugin.p.vv(str, jSONObject);
                    } else {
                        com.bytedance.sdk.openadsdk.api.plugin.p.m(str, jSONObject);
                    }
                }

                @Override // com.bytedance.pangle.log.IZeusReporter
                public void saveRecord(String str, String str2) {
                    com.bytedance.sdk.openadsdk.api.plugin.m.vv(str, str2);
                }
            };
            GlobalParam globalParam = GlobalParam.getInstance();
            globalParam.setReporter(iZeusReporter);
            globalParam.setCheckPermission(false);
            globalParam.setDownloadDir(p(context));
            globalParam.setLogger(new m());
            globalParam.setSignature("com.byted.pangle", "MIIDfTCCAmWgAwIBAgIEfRwYPjANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzESMBAGA1UEChMJQnl0ZURhbmNlMQ8wDQYDVQQLEwZQYW5nbGUxFzAVBgNVBAMTDkNodWFuIFNoYW4gSmlhMB4XDTIxMTEwODA2MjQzOVoXDTQ2MTEwMjA2MjQzOVowbzELMAkGA1UEBhMCQ04xEDAOBgNVBAgTB0JlaWppbmcxEDAOBgNVBAcTB0JlaWppbmcxEjAQBgNVBAoTCUJ5dGVEYW5jZTEPMA0GA1UECxMGUGFuZ2xlMRcwFQYDVQQDEw5DaHVhbiBTaGFuIEppYTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIBKeRL+4mfCn1SLYv6OemfwwItkjlLPyqOEugkV6lanFTcZgLwEl5LIkL0y28UncPtMX1Mii6DzCdJ/plw7S9+RT/hYDneu339IKWojaU2qai/5FokHlQ0MMnYl5yry00ghVPsl1u+03cQA2ZnjIMiFhrBJpQzHt7IYvq2aEEMBcY8uT7iFoBI848e1mL1joVS2z02C3NliP7ZNARkXH+rTQAlCJulT5IZk+V/PTaKqzgNrkhsKh0/tBmU7m8u79x/xpgGsE19H18AgS4P/9/MDCRe2Z35boZeccaUy2MXCwv3djzUcDk3rRzQPYzdpyyRnrFMuhiKesc5VHgUMs9kCAwEAAaMhMB8wHQYDVR0OBBYEFENENrNWGzc2WhxdvhoMDs57U70zMA0GCSqGSIb3DQEBCwUAA4IBAQAHqDCrmvyBBmIGXwuL1rwS/Qv9ZJIZykBIaNMm+H1IfitCl4yXd9N2n+PjE0UZtxZ21UZOt9wAr+RFiSl5YRXqpt7WLARTy4YW3RiQ+wiL7bshzeSYBoSiC427Bfeq0WjwY0/jHlr8uouppyJOz++6U9hrYX2EW/6UjH5XlWiKQJ6b2ZzPcP8Xpg/TJn4tWvXJP6jw9kRRP2GmMttY78leWQst2QEZILmWJubXRLPj9O+qx2uP9oGTD4sc1vb9hzkOHBIHzGaalqLFbbGaeFpLFHoGTsnOfPTwUVKDZYmxbkcmR1bp7eYOW+nSQNMLn0FjDewZl5l37Sa/gz0WVHon");
            globalParam.setSignature("com.byted.csj.ext", "MIIDezCCAmOgAwIBAgIENkE1KDANBgkqhkiG9w0BAQsFADBtMQswCQYDVQQGEwI4NjEQMA4GA1UECBMHYmVpamluZzEQMA4GA1UEBxMHYmVpamluZzESMBAGA1UEChMJYnl0ZWRhbmNlMRIwEAYDVQQLEwlieXRlZGFuY2UxEjAQBgNVBAMTCWJ5dGVkYW5jZTAgFw0yMjExMDIwODI3MzlaGA8yMDUwMDMyMDA4MjczOVowbTELMAkGA1UEBhMCODYxEDAOBgNVBAgTB2JlaWppbmcxEDAOBgNVBAcTB2JlaWppbmcxEjAQBgNVBAoTCWJ5dGVkYW5jZTESMBAGA1UECxMJYnl0ZWRhbmNlMRIwEAYDVQQDEwlieXRlZGFuY2UwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCc9Z2F3xxOMX1qTXMy2aPmS9OSkqrp8C8bHwS1hkNVR4umKREuqOn73INNo+R706jaCVnlPwxDwWjtX6H74DE4CveivyM9f2wNC3yIyDW+5j7lW/keTQcOlGLDEJQv4O/6FbB/jNU6epjyNaNIZhgZcvTpgaSixbdyHzRTFmvMh+WovdVK/J9LnHOQ+pmPZj7NB6MQRGMUrPEotLHQca3cmnLrnPAaZQaVoaFE9lOt9syyqEuf361SprNIGDtbkJuX3EqV/QOKWFwZX94IS7ZGSvfyCojcD4kaUSbaSoZC7zEuBb7l69g+ZMrJ/v6wkm01wxsNNssUwF7k6Sp0zubbAgMBAAGjITAfMB0GA1UdDgQWBBSxk+gVdDco1dP65hP67qoKNlMEYDANBgkqhkiG9w0BAQsFAAOCAQEAfosExl/AYEbS2xqHBTHa28cvnp/SElUQuzW6aWLqkfk9cxmFSI/euUV3/eB8RN+U2X47Y05u6+XUxTv0tSSEtyXNawm0qWH8jkR4gZY38YqBChKjhea668oT5X3Uocrw7SYXO/BfI8SKPa0uI/U8Cyl3uctbmmq/pPUkd3mKAy+HgyJoThD6K0oyiADlygngUMVTv6Uvid4qPj/bBnxI+LvVeX4l1dxGqWkiafQW9sz+RbFdge3X2XsSH4eo01BsCwOYEv1lHO2FrbAtFNpnIsSqrERdFaAJZ3tlJmg9bA03png8A2AajEjkhaOhduJB8zkSlvHNpoQMIAS9WtkG/w==");
            globalParam.setSignature("com.byted.live.lite", "MIIDSTCCAjGgAwIBAgIEaLy5tzANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwIxMTEMMAoGA1UECBMDMTExMQ4wDAYDVQQHEwUxMTExMTEMMAoGA1UEChMDMTExMQwwCgYDVQQLEwMxMTExDDAKBgNVBAMTAzExMTAeFw0yMDEyMDMxMjQyMTJaFw00NTExMjcxMjQyMTJaMFUxCzAJBgNVBAYTAjExMQwwCgYDVQQIEwMxMTExDjAMBgNVBAcTBTExMTExMQwwCgYDVQQKEwMxMTExDDAKBgNVBAsTAzExMTEMMAoGA1UEAxMDMTExMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA45E52YdkJm4gPCXZq7KDoM1h6pgSswllC/CwDOmh8pDGvX4ROaYP1vr2biRlXMHg7G0iXpxWVdlTtx+4QFd3dC+cGJQk0f6apGo2n2RpMA0zIsSf0VO1a3GjWLei5INo+4RDdciqJ4jfsoqBIjZETRkky+UU4eO/oyrAwOu4KdMln3Bg3u7eHWU4kMFrXxrRruT3Q/9gzlO90yQa0CZPWVDrk6cGJtJwJGhWm+62S3U8D26HE++eGP7ve83QBDGtKqx7HpCAFWUiYBgXGq12H0amQDkKcPcr/EFCaBlombSgkN0t6zBX80m+wcUPC75IBTmMV/DT2dXcgjZ2I1JSCQIDAQABoyEwHzAdBgNVHQ4EFgQUPDyIeKI0KhZFPHyn36gMMIYrpukwDQYJKoZIhvcNAQELBQADggEBAHkl0DoCRwn+XKsDJE+wGMpBBqUDzL6DSOnJx4SNqb7YZZU0ThcDK7jY4If3QRkvMio6ODrVZc2U/m/Tc3VeMk5h2W2UZRUWHNH3k9Xe0720uL20ZeH2Y6IG4L5HG8kIbTbFtX3gJpPG/xAcez+CzyCFLWQAZt1N+csG0syWkXJ0Nryq8VrgSCyCXD1KzFxrOe+65wtu50Vi68Vlbk7BZe/G8Qm0RhKmxq5BPMBJ4uY3be+03Ba5qC//o1XQHOEAjrJKXcN5wqHdFZTkmuxVyIPogZOzx4JlNl0zOrYGDJxp7aZfKF9FkXQyF7x0Ns3mZEtjx/+flXRzAAU9MDhPr/0=");
            Zeus.registerPluginStateListener(new ZeusPluginStateListener() { // from class: com.bytedance.sdk.openadsdk.api.plugin.o.2
                @Override // com.bytedance.pangle.ZeusPluginStateListener
                public void onPluginStateChange(String str, int i4, Object... objArr) {
                    com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", str + " state changed, " + i4);
                    if (i4 != 9 || TextUtils.equals(str, "com.byted.pangle")) {
                        return;
                    }
                    o.this.p(str);
                }
            });
            globalParam.closeBgDex2oat(true);
            Zeus.init((Application) context, true);
            Zeus.registerPluginInstallListener(new ZeusPluginInstallListener() { // from class: com.bytedance.sdk.openadsdk.api.plugin.o.3
                @Override // com.bytedance.pangle.ZeusPluginInstallListener
                public void onPluginInstall(String str, int i4, String str2) {
                    if (i4 == 7) {
                        o.this.m(str, i4);
                    } else if (i4 == 6) {
                        o.this.m(str, i4);
                        if (o.this.f8718b != null && "com.byted.pangle".equals(str)) {
                            o.this.f8718b.onEvent(0, b.b().f(true).a());
                        } else {
                            com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "no main pl");
                        }
                    }
                }
            });
            this.f8720n = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Unexpected error for init zeus.", th);
            this.qv = th.getMessage();
        }
    }

    public static o vv(Context context) {
        if (f8716o == null) {
            synchronized (o.class) {
                if (f8716o == null) {
                    f8716o = new o(context);
                }
            }
        }
        return f8716o;
    }

    private static File p(Context context) {
        return new File(new File(context.getDir("tt_pangle_bykv_file", 0), "pangle_com.byted.pangle"), vv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(String str, int i4) {
        com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin update failed");
        Bundle bundle = new Bundle();
        bundle.putInt("code", i4);
        TTPluginListener tTPluginListener = f8715m.get(str);
        if (tTPluginListener != null) {
            tTPluginListener.onPluginListener(1001, null, null, bundle);
        }
    }

    public JSONObject vv() {
        return this.f8719k;
    }

    public BaseDexClassLoader vv(i iVar) throws Exception {
        return vv(iVar, 60000);
    }

    public BaseDexClassLoader vv(i iVar, int i4) throws Exception {
        if (this.f8720n) {
            if (!Zeus.isPluginInstalled("com.byted.pangle")) {
                try {
                    com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "wait start");
                    this.f8721u.await(i4, TimeUnit.MILLISECONDS);
                    com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "wait done");
                    iVar.m("wait_install_cost");
                } catch (Exception unused) {
                    com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Install wait time out");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.vv(8, "install wait timeout");
                }
            }
            boolean z4 = false;
            if (Zeus.isPluginLoaded("com.byted.pangle") || Zeus.loadPlugin("com.byted.pangle")) {
                f8714i = Zeus.getPlugin("com.byted.pangle").mClassLoader;
                z4 = true;
            }
            iVar.m("get_classloader_cost");
            Zeus.installFromDownloadDir();
            if (f8714i == null) {
                if (this.f8721u.getCount() != 0) {
                    com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "Install wait time out");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.vv(8, "install wait timeout");
                } else if (z4) {
                    com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "Get null after load");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.vv(9, "Get null after load");
                }
            }
            iVar.m("get_classloader_done");
            return f8714i;
        }
        com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "Zeus init failed.");
        throw new com.bytedance.sdk.openadsdk.api.plugin.vv(4, this.qv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, int i4) {
        if ("com.byted.pangle".equals(str) && i4 == 6) {
            com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "notify to end wait");
            this.f8721u.countDown();
        }
        vv(i4 == 6, str);
    }

    public void m(final TTPluginListener tTPluginListener) {
        com.bytedance.sdk.openadsdk.o.vv.vv().m(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.o.5
            @Override // java.lang.Runnable
            public void run() {
                String packageName = tTPluginListener.packageName();
                Plugin plugin = (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) ? Zeus.getPlugin(packageName) : null;
                StringBuilder sb = new StringBuilder("Find plugin:");
                sb.append(plugin != null);
                com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", sb.toString());
                if (plugin == null) {
                    TTPluginListener unused = o.jh = tTPluginListener;
                    return;
                }
                o.m(plugin);
                tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Plugin plugin) {
        if (plugin == null) {
            com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin is null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action", 0);
        bundle.putString("plugin_pkg_name", plugin.mPkgName);
        bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, vv(plugin.getVersion()));
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            adManager.getExtra(Bundle.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(vv vvVar) {
        File file;
        if (vvVar != null && (file = vvVar.f8724m) != null) {
            boolean syncInstallPlugin = Zeus.syncInstallPlugin(vvVar.mPackageName, file.getAbsolutePath());
            vv(syncInstallPlugin, vvVar.mPackageName);
            return syncInstallPlugin;
        }
        com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "plugin config is null");
        return false;
    }

    public void m() {
        EventListener eventListener = this.f8718b;
        if (eventListener != null) {
            eventListener.onEvent(1, b.b().f(true).a());
        }
    }

    public Bundle vv(String str, Bundle bundle) {
        String vv2 = vv(str);
        if (!TextUtils.isEmpty(vv2)) {
            bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, vv2);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(str, bundle);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(PluginConstants.KEY_PL_CONFIG_INFO, bundle2);
        return bundle3;
    }

    public static String vv(String str) {
        Plugin plugin;
        try {
            if (!Zeus.isPluginInstalled(str) || (plugin = Zeus.getPlugin(str)) == null) {
                return null;
            }
            return vv(plugin.getVersion());
        } catch (Throwable unused) {
            com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "Get local version failed");
            return null;
        }
    }

    public void vv(final TTPluginListener tTPluginListener) {
        if (!this.f8720n) {
            com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "Zeus init failed.");
            if (tTPluginListener != null) {
                tTPluginListener.onPluginListener(1002, null, null, null);
                return;
            }
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.o.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Load plugin failed, caused by timeout.");
                tTPluginListener.onPluginListener(1001, null, null, null);
            }
        }, 180000L);
        String packageName = tTPluginListener.packageName();
        Plugin plugin = (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) ? Zeus.getPlugin(packageName) : null;
        StringBuilder sb = new StringBuilder("Find plugin:");
        sb.append(plugin != null);
        com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", sb.toString());
        if (plugin != null) {
            m(plugin);
            handler.removeCallbacksAndMessages(null);
            tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
            return;
        }
        f8715m.put(packageName, tTPluginListener);
        f8717p.put(packageName, handler);
    }

    private static vv vv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        vv vvVar = new vv();
        vvVar.mPackageName = jSONObject.optString(bm.f63454o);
        vvVar.mVersionCode = jSONObject.optInt("version_code");
        vvVar.mUrl = jSONObject.optString(COSHttpResponseKey.DOWNLOAD_URL);
        vvVar.mMd5 = jSONObject.optString("md5");
        vvVar.mApiVersionMin = jSONObject.optInt("min_version");
        vvVar.mApiVersionMax = jSONObject.optInt("max_version");
        vvVar.vv = jSONObject.optString(Constant.MD5);
        vvVar.mFlag = jSONObject.optBoolean("is_revert") ? 3 : 2;
        vvVar.f8724m = new File(jSONObject.optString("plugin_file"));
        return vvVar;
    }

    public static String vv(int i4) {
        char[] charArray = String.valueOf(i4).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            sb.append(charArray[i5]);
            if (i5 < charArray.length - 1) {
                sb.append(h0.f27805a);
            }
        }
        return sb.toString();
    }

    private static boolean vv(TTPluginListener tTPluginListener, String str) {
        if (tTPluginListener == null || tTPluginListener.packageName() == null) {
            return false;
        }
        return tTPluginListener.packageName().equals(str);
    }

    private static void vv(boolean z4, String str) {
        HashMap<String, TTPluginListener> hashMap = f8715m;
        TTPluginListener tTPluginListener = hashMap.get(str);
        StringBuilder sb = new StringBuilder("Install dl plugin ");
        sb.append(str);
        sb.append(z4 ? " success" : " failed");
        sb.append(", need notify: ");
        sb.append(tTPluginListener != null);
        com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", sb.toString());
        HashMap<String, Handler> hashMap2 = f8717p;
        Handler handler = hashMap2.get(str);
        if (z4) {
            TTPluginListener tTPluginListener2 = jh;
            if (!vv(tTPluginListener2, str) && (tTPluginListener == null || handler == null)) {
                return;
            }
            if (Zeus.loadPlugin(str)) {
                Plugin plugin = Zeus.getPlugin(str);
                m(plugin);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (tTPluginListener != null) {
                    tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                }
                if (vv(tTPluginListener2, str)) {
                    tTPluginListener2.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                    jh = null;
                }
            } else {
                com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "handle installed, load failed");
                p(str, 1002);
            }
        } else {
            com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "handle installed failed");
            p(str, 1003);
        }
        hashMap.remove(str);
        hashMap2.remove(str);
    }

    public static void vv(Throwable th) {
        if (th instanceof AbstractMethodError) {
            Zeus.unInstallPlugin("com.byted.pangle");
            com.bytedance.sdk.openadsdk.api.p.i("TTPluginManager", "AbstractMethodError, rollback to builtin version.");
        }
    }
}
