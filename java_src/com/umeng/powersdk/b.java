package com.umeng.powersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Context f64701a;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f64702a = new b((byte) 0);
    }

    private b() {
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a(Context context) {
        if (f64701a == null && context != null) {
            f64701a = context.getApplicationContext();
        }
        return a.f64702a;
    }

    public final synchronized com.umeng.powersdk.a a() {
        com.umeng.powersdk.a aVar;
        com.umeng.powersdk.a aVar2 = null;
        try {
            Intent registerReceiver = f64701a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i4 = 0;
            int intExtra = registerReceiver.getIntExtra(SimulatorExitPlayActivity_.O, 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            int i5 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i5 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i5 = 0;
                } else if (intExtra4 == 5) {
                    i5 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i4 = 1;
            } else if (intExtra5 == 2) {
                i4 = 2;
            }
            aVar = new com.umeng.powersdk.a();
            try {
                aVar.f64695a = intExtra;
                aVar.f64696b = intExtra2;
                aVar.f64698d = i5;
                aVar.f64697c = intExtra3;
                aVar.f64699e = i4;
                aVar.f64700f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
                return aVar;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }
}
