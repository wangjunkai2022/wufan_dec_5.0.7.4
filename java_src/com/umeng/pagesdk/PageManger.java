package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
/* loaded from: classes6.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* renamed from: a  reason: collision with root package name */
    private static Context f64649a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f64650b = false;

    /* renamed from: c  reason: collision with root package name */
    private static EfsReporter f64651c = null;

    /* renamed from: d  reason: collision with root package name */
    private static PageConfigManger f64652d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f64653e = true;

    /* renamed from: f  reason: collision with root package name */
    private static float f64654f = 0.0f;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f64649a;
    }

    public static PageConfigManger getPageConfigManger() {
        return f64652d;
    }

    public static float getRefreshRate() {
        return f64654f;
    }

    public static EfsReporter getReporter() {
        return f64651c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
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
        if (isInit()) {
            return;
        }
        f64649a = context.getApplicationContext();
        f64651c = efsReporter;
        f64652d = new PageConfigManger(context, efsReporter);
        f64650b = true;
    }

    public static boolean isControlMainThread() {
        return f64653e;
    }

    public static boolean isInit() {
        return f64650b;
    }

    public static void onTracePageBegin(Activity activity, String str) {
        try {
            onTracePageBegin(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z4) {
        if (activity != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z4 || !(str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                    if (str.length() > 10) {
                        if (isDebug) {
                            StringBuilder sb = new StringBuilder("tracePageBegin. method name is ");
                            sb.append(str);
                            sb.append("method name over length !");
                            return;
                        }
                        return;
                    }
                    if (f64653e && !e.a(activity.getApplicationContext())) {
                        boolean z5 = isDebug;
                    }
                    String name = activity.getClass().getName();
                    if (f64654f <= 0.0f) {
                        f64654f = Build.VERSION.SDK_INT >= 30 ? activity.getDisplay().getRefreshRate() : activity.getWindowManager().getDefaultDisplay().getRefreshRate();
                    }
                    d.a(name, str, z4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onTracePageEnd(Activity activity, String str) {
        try {
            onTracePageEnd(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z4) {
        if (activity != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z4 || !(str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                    if (str.length() <= 10) {
                        if (f64653e && !e.a(activity.getApplicationContext())) {
                            boolean z5 = isDebug;
                        }
                        d.b(activity.getClass().getName(), str, z4);
                    } else if (isDebug) {
                        StringBuilder sb = new StringBuilder("tracePageEnd. method name is ");
                        sb.append(str);
                        sb.append("method name over length !");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void setControlMainThread(boolean z4) {
        f64653e = z4;
    }
}
