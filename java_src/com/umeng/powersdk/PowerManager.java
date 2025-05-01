package com.umeng.powersdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.powersdk.c;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public class PowerManager {
    public static final String TAG = "PowerManager";

    /* renamed from: a  reason: collision with root package name */
    private static Context f64691a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f64692b = false;

    /* renamed from: c  reason: collision with root package name */
    private static EfsReporter f64693c = null;

    /* renamed from: d  reason: collision with root package name */
    private static PowerConfigManager f64694d = null;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f64691a;
    }

    public static PowerConfigManager getPowerConfigManager() {
        return f64694d;
    }

    public static EfsReporter getReporter() {
        return f64693c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        final c cVar;
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
        f64691a = context.getApplicationContext();
        f64693c = efsReporter;
        f64694d = new PowerConfigManager(context, efsReporter);
        f64692b = true;
        cVar = c.a.f64719a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer()) {
                return;
            }
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("efs_power", 0);
            if (sharedPreferences != null) {
                cVar.f64704b = sharedPreferences.getInt("apm_powerperf_collect_interval", 5);
                cVar.f64705c = sharedPreferences.getInt("apm_powerperf_collect_max_period_sec", 100);
            }
            final HandlerThread handlerThread = new HandlerThread("power-info");
            handlerThread.start();
            final Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.umeng.powersdk.c.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == c.this.f64703a) {
                        try {
                            handlerThread.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            handler.post(new Runnable() { // from class: com.umeng.powersdk.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final c cVar2 = c.this;
                        final Handler handler2 = handler;
                        final int i4 = cVar2.f64704b;
                        final int i5 = cVar2.f64705c;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        handler2.post(new Runnable() { // from class: com.umeng.powersdk.c.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (c.this.f64707e) {
                                    if (SystemClock.elapsedRealtime() - elapsedRealtime > i5 * 1000) {
                                        handler2.sendEmptyMessage(c.this.f64703a);
                                        return;
                                    }
                                    try {
                                        EfsJSONLog efsJSONLog = new EfsJSONLog("powerperf");
                                        efsJSONLog.put("power", c.this.a());
                                        EfsReporter reporter = PowerManager.getReporter();
                                        if (reporter != null) {
                                            reporter.send(efsJSONLog);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                handler2.postDelayed(this, i4 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        handler.sendEmptyMessage(c.this.f64703a);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isInit() {
        return f64692b;
    }

    public static void onActivityResumed(Activity activity) {
        c cVar;
        cVar = c.a.f64719a;
        try {
            if (getPowerConfigManager() != null && getPowerConfigManager().enableTracer()) {
                cVar.f64706d = new WeakReference<>(activity);
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStarted(Activity activity) {
        c cVar;
        cVar = c.a.f64719a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (cVar.f64709g) {
                cVar.f64709g = false;
                return;
            }
            int i4 = cVar.f64708f + 1;
            cVar.f64708f = i4;
            if (i4 == 1) {
                cVar.f64707e = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStopped(Activity activity) {
        c cVar;
        cVar = c.a.f64719a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (activity.isChangingConfigurations()) {
                cVar.f64709g = true;
                return;
            }
            int i4 = cVar.f64708f - 1;
            cVar.f64708f = i4;
            if (i4 == 0) {
                cVar.f64707e = false;
            }
        } catch (Throwable unused) {
        }
    }
}
