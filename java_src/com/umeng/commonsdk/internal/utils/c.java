package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
/* compiled from: BatteryUtils.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64288a = "BatteryUtils";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f64289b;

    /* renamed from: c  reason: collision with root package name */
    private static Context f64290c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f64291d;

    /* compiled from: BatteryUtils.java */
    /* loaded from: classes6.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f64293a = new c();

        private a() {
        }
    }

    public static c a(Context context) {
        if (f64290c == null && context != null) {
            f64290c = context.getApplicationContext();
        }
        return a.f64293a;
    }

    public synchronized void b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f64290c.registerReceiver(this.f64291d, intentFilter);
            f64289b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64290c, th);
        }
    }

    public synchronized void c() {
        try {
            f64290c.unregisterReceiver(this.f64291d);
            f64289b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f64290c, th);
        }
    }

    private c() {
        this.f64291d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "ACTION_BATTERY_CHANGED：battery info cc.");
                        int i4 = 0;
                        int intExtra = intent.getIntExtra(SimulatorExitPlayActivity_.O, 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra("status", 0);
                        int i5 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i5 = 1;
                            } else if (intExtra4 == 4) {
                                i5 = 0;
                            } else if (intExtra4 == 5) {
                                i5 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i4 = 1;
                        } else if (intExtra5 == 2) {
                            i4 = 2;
                        }
                        b bVar = new b();
                        bVar.f64282a = intExtra;
                        bVar.f64283b = intExtra2;
                        bVar.f64285d = i5;
                        bVar.f64284c = intExtra3;
                        bVar.f64286e = i4;
                        bVar.f64287f = System.currentTimeMillis();
                        UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f64237h, com.umeng.commonsdk.internal.b.a(c.f64290c).a(), bVar);
                        c.this.c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(c.f64290c, th);
                }
            }
        };
    }

    public synchronized boolean a() {
        return f64289b;
    }
}
