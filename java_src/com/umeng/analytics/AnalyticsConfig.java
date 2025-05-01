package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.l;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Map;
/* loaded from: classes6.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final String DEBUG_KEY = "debugkey";
    public static final String DEBUG_MODE_PERIOD = "sendaging";
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";
    public static final String RTD_PERIOD = "period";
    public static final String RTD_START_TIME = "startTime";

    /* renamed from: a  reason: collision with root package name */
    static double[] f63208a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f63209b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f63210c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f63211d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f63212e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;
    public static final String RTD_SP_FILE = aw.b().b(aw.A);

    /* renamed from: f  reason: collision with root package name */
    private static Object f63213f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f63214g = false;

    /* renamed from: h  reason: collision with root package name */
    private static String f63215h = "";

    static void a(String str) {
        f63210c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f63208a;
    }

    public static String getRealTimeDebugKey() {
        String str;
        synchronized (f63213f) {
            str = f63215h;
        }
        return str;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f63211d)) {
            f63211d = com.umeng.common.b.a(context).c();
        }
        return f63211d;
    }

    public static int getVerticalType(Context context) {
        if (f63212e == 0) {
            f63212e = com.umeng.common.b.a(context).d();
        }
        return f63212e;
    }

    public static boolean isRealTimeDebugMode() {
        boolean z4;
        synchronized (f63213f) {
            z4 = f63214g;
        }
        return z4;
    }

    public static void turnOffRealTimeDebug() {
        synchronized (f63213f) {
            f63214g = false;
            f63215h = "";
        }
    }

    public static void turnOnRealTimeDebug(Map<String, String> map) {
        synchronized (f63213f) {
            f63214g = true;
            if (map != null && map.containsKey("debugkey")) {
                f63215h = map.get("debugkey");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f63211d = str;
            com.umeng.common.b.a(context).a(f63211d);
            return;
        }
        UMLog.aq(l.A, 0, "\\|");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, int i4) {
        f63212e = i4;
        com.umeng.common.b.a(context).a(f63212e);
    }
}
