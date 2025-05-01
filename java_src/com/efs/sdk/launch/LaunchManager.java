package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
/* loaded from: classes2.dex */
public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";

    /* renamed from: a  reason: collision with root package name */
    private static LaunchConfigManager f10475a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Context f10476b = null;

    /* renamed from: c  reason: collision with root package name */
    private static EfsReporter f10477c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f10478d = false;
    public static boolean isDebug = true;

    static /* synthetic */ boolean a() {
        f10478d = true;
        return true;
    }

    public static LaunchConfigManager getLaunchConfigManager() {
        return f10475a;
    }

    public static EfsReporter getReporter() {
        return f10477c;
    }

    public static void init(Context context, final EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        if (c.e(applicationContext) && !isInit()) {
            f10476b = context.getApplicationContext();
            f10477c = efsReporter;
            a.a(new Runnable() { // from class: com.efs.sdk.launch.LaunchManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        LaunchConfigManager unused = LaunchManager.f10475a = new LaunchConfigManager(applicationContext, efsReporter);
                        LaunchManager.a();
                        b.a(applicationContext, (String) null);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        }
    }

    public static boolean isInit() {
        return f10478d;
    }

    public static void onTraceApp(Application application, String str, boolean z4) {
        if (application != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.equals(APP_ATTACH_BASE_CONTEXT) || Looper.getMainLooper() == Looper.myLooper()) {
                    b.a(str, z4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTraceBegin(Context context, String str, long j4) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                context.getApplicationContext();
                if (Looper.getMainLooper() == Looper.myLooper() && str.length() <= 10) {
                    b.a(str, j4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTraceEnd(Context context, String str, long j4) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                context.getApplicationContext();
                if (Looper.getMainLooper() == Looper.myLooper() && str.length() <= 10) {
                    b.b(str, j4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTracePage(Activity activity, String str, boolean z4) {
        if (activity != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                activity.getApplicationContext();
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    return;
                }
                b.a(activity, str, z4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void sendLaunchCache(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
