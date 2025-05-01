package com.umeng.pagesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f64661a;

    /* renamed from: b  reason: collision with root package name */
    private static Context f64662b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0681b f64663c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f64664d;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f64666a = new b((byte) 0);
    }

    /* renamed from: com.umeng.pagesdk.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0681b {
        void a(com.umeng.pagesdk.a aVar);
    }

    private b() {
        this.f64664d = new BroadcastReceiver() { // from class: com.umeng.pagesdk.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
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
                        com.umeng.pagesdk.a aVar = new com.umeng.pagesdk.a();
                        aVar.f64655a = intExtra;
                        aVar.f64656b = intExtra2;
                        aVar.f64658d = i5;
                        aVar.f64657c = intExtra3;
                        aVar.f64659e = i4;
                        aVar.f64660f = System.currentTimeMillis();
                        if (b.this.f64663c != null) {
                            b.this.f64663c.a(aVar);
                        }
                        b.this.b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a(Context context) {
        if (f64662b == null && context != null) {
            f64662b = context.getApplicationContext();
        }
        return a.f64666a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            f64662b.unregisterReceiver(this.f64664d);
            f64661a = false;
        } catch (Throwable unused) {
        }
    }

    public final synchronized com.umeng.pagesdk.a a() {
        com.umeng.pagesdk.a aVar;
        int i4;
        int intExtra;
        int intExtra2;
        int intExtra3;
        int i5;
        com.umeng.pagesdk.a aVar2 = null;
        try {
            Intent registerReceiver = f64662b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i4 = 0;
            intExtra = registerReceiver.getIntExtra(SimulatorExitPlayActivity_.O, 0);
            intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            i5 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i5 = 1;
                } else if (intExtra4 == 4) {
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
            aVar = new com.umeng.pagesdk.a();
        } catch (Throwable unused) {
        }
        try {
            aVar.f64655a = intExtra;
            aVar.f64656b = intExtra2;
            aVar.f64658d = i5;
            aVar.f64657c = intExtra3;
            aVar.f64659e = i4;
            aVar.f64660f = System.currentTimeMillis();
        } catch (Throwable unused2) {
            aVar2 = aVar;
            aVar = aVar2;
            return aVar;
        }
        return aVar;
    }

    public final synchronized void a(InterfaceC0681b interfaceC0681b) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f64662b.registerReceiver(this.f64664d, intentFilter);
            f64661a = true;
            this.f64663c = interfaceC0681b;
        } catch (Throwable unused) {
        }
    }
}
