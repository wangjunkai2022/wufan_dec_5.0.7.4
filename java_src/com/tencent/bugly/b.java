package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.n;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f62191a = true;

    /* renamed from: b  reason: collision with root package name */
    public static List<a> f62192b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f62193c;

    /* renamed from: d  reason: collision with root package name */
    private static p f62194d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f62195e;

    private static boolean a(com.tencent.bugly.crashreport.common.info.a aVar) {
        List<String> list = aVar.f62264o;
        return list != null && list.contains("bugly");
    }

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            a(context, null);
        }
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (b.class) {
            if (f62195e) {
                x.d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str = x.f62732a;
            } else {
                com.tencent.bugly.crashreport.common.info.a a5 = com.tencent.bugly.crashreport.common.info.a.a(context);
                if (a(a5)) {
                    f62191a = false;
                    return;
                }
                String f5 = a5.f();
                if (f5 == null) {
                    String str2 = x.f62732a;
                } else {
                    a(context, f5, a5.f62270u, buglyStrategy);
                }
            }
        }
    }

    public static synchronized void a(Context context, String str, boolean z4, BuglyStrategy buglyStrategy) {
        byte[] bArr;
        synchronized (b.class) {
            if (f62195e) {
                x.d("[init] initial Multi-times, ignore this.", new Object[0]);
            } else if (context == null) {
                String str2 = x.f62732a;
            } else if (str == null) {
                String str3 = x.f62732a;
            } else {
                f62195e = true;
                if (z4) {
                    f62193c = true;
                    x.f62733b = true;
                    x.d("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
                    x.e("--------------------------------------------------------------------------------------------", new Object[0]);
                    x.d("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
                    x.d("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
                    x.d("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
                    x.d("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
                    x.e("--------------------------------------------------------------------------------------------", new Object[0]);
                    x.b("[init] Open debug mode of Bugly.", new Object[0]);
                }
                x.a(" crash report start initializing...", new Object[0]);
                x.b("[init] Bugly start initializing...", new Object[0]);
                x.a("[init] Bugly complete version: v%s", "3.4.4");
                Context a5 = z.a(context);
                com.tencent.bugly.crashreport.common.info.a a6 = com.tencent.bugly.crashreport.common.info.a.a(a5);
                a6.p();
                y.a(a5);
                f62194d = p.a(a5, f62192b);
                u.a(a5);
                com.tencent.bugly.crashreport.common.strategy.a a7 = com.tencent.bugly.crashreport.common.strategy.a.a(a5, f62192b);
                n a8 = n.a(a5);
                if (a(a6)) {
                    f62191a = false;
                    return;
                }
                a6.a(str);
                x.a("[param] Set APP ID:%s", str);
                if (buglyStrategy != null) {
                    String appVersion = buglyStrategy.getAppVersion();
                    if (!TextUtils.isEmpty(appVersion)) {
                        if (appVersion.length() > 100) {
                            String substring = appVersion.substring(0, 100);
                            x.d("appVersion %s length is over limit %d substring to %s", appVersion, 100, substring);
                            appVersion = substring;
                        }
                        a6.f62259j = appVersion;
                        x.a("[param] Set App version: %s", buglyStrategy.getAppVersion());
                    }
                    try {
                        if (buglyStrategy.isReplaceOldChannel()) {
                            String appChannel = buglyStrategy.getAppChannel();
                            if (!TextUtils.isEmpty(appChannel)) {
                                if (appChannel.length() > 100) {
                                    String substring2 = appChannel.substring(0, 100);
                                    x.d("appChannel %s length is over limit %d substring to %s", appChannel, 100, substring2);
                                    appChannel = substring2;
                                }
                                f62194d.a(556, "app_channel", appChannel.getBytes(), (o) null, false);
                                a6.f62261l = appChannel;
                            }
                        } else {
                            Map<String, byte[]> a9 = f62194d.a(556, (o) null, true);
                            if (a9 != null && (bArr = a9.get("app_channel")) != null) {
                                a6.f62261l = new String(bArr);
                            }
                        }
                        x.a("[param] Set App channel: %s", a6.f62261l);
                    } catch (Exception e5) {
                        if (f62193c) {
                            e5.printStackTrace();
                        }
                    }
                    String appPackageName = buglyStrategy.getAppPackageName();
                    if (!TextUtils.isEmpty(appPackageName)) {
                        if (appPackageName.length() > 100) {
                            String substring3 = appPackageName.substring(0, 100);
                            x.d("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, substring3);
                            appPackageName = substring3;
                        }
                        a6.f62252c = appPackageName;
                        x.a("[param] Set App package: %s", buglyStrategy.getAppPackageName());
                    }
                    String deviceID = buglyStrategy.getDeviceID();
                    if (deviceID != null) {
                        if (deviceID.length() > 100) {
                            String substring4 = deviceID.substring(0, 100);
                            x.d("deviceId %s length is over limit %d substring to %s", deviceID, 100, substring4);
                            deviceID = substring4;
                        }
                        a6.c(deviceID);
                        x.a("[param] Set device ID: %s", deviceID);
                    }
                    String deviceModel = buglyStrategy.getDeviceModel();
                    if (deviceModel != null) {
                        a6.d(deviceModel);
                        x.a("[param] Set device model: %s", deviceModel);
                    }
                    a6.f62254e = buglyStrategy.isUploadProcess();
                    y.f62735a = buglyStrategy.isBuglyLogUpload();
                }
                for (int i4 = 0; i4 < f62192b.size(); i4++) {
                    if (a8.a(f62192b.get(i4).id)) {
                        f62192b.get(i4).init(a5, z4, buglyStrategy);
                    }
                }
                com.tencent.bugly.crashreport.biz.b.a(a5, buglyStrategy);
                a7.a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                x.b("[init] Bugly initialization finished.", new Object[0]);
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            if (!f62192b.contains(aVar)) {
                f62192b.add(aVar);
            }
        }
    }
}
