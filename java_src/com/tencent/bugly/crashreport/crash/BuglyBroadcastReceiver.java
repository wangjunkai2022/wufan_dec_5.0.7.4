package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class BuglyBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    private static BuglyBroadcastReceiver f62310d;

    /* renamed from: b  reason: collision with root package name */
    private Context f62312b;

    /* renamed from: c  reason: collision with root package name */
    private String f62313c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62314e = true;

    /* renamed from: a  reason: collision with root package name */
    private IntentFilter f62311a = new IntentFilter();

    public static synchronized BuglyBroadcastReceiver getInstance() {
        BuglyBroadcastReceiver buglyBroadcastReceiver;
        synchronized (BuglyBroadcastReceiver.class) {
            if (f62310d == null) {
                f62310d = new BuglyBroadcastReceiver();
            }
            buglyBroadcastReceiver = f62310d;
        }
        return buglyBroadcastReceiver;
    }

    public synchronized void addFilter(String str) {
        if (!this.f62311a.hasAction(str)) {
            this.f62311a.addAction(str);
        }
        x.c("add action %s", str);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public synchronized void register(Context context) {
        this.f62312b = context;
        z.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.BuglyBroadcastReceiver.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    x.a(BuglyBroadcastReceiver.f62310d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        BuglyBroadcastReceiver.this.f62312b.registerReceiver(BuglyBroadcastReceiver.f62310d, BuglyBroadcastReceiver.this.f62311a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public synchronized void unregister(Context context) {
        try {
            x.a(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f62312b = context;
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f62314e) {
                    this.f62314e = false;
                    return true;
                }
                String b5 = com.tencent.bugly.crashreport.common.info.b.b(this.f62312b);
                x.c("is Connect BC " + b5, new Object[0]);
                x.a("network %s changed to %s", this.f62313c, b5);
                if (b5 == null) {
                    this.f62313c = null;
                    return true;
                }
                String str = this.f62313c;
                this.f62313c = b5;
                long currentTimeMillis = System.currentTimeMillis();
                com.tencent.bugly.crashreport.common.strategy.a a5 = com.tencent.bugly.crashreport.common.strategy.a.a();
                u a6 = u.a();
                com.tencent.bugly.crashreport.common.info.a a7 = com.tencent.bugly.crashreport.common.info.a.a(context);
                if (a5 != null && a6 != null && a7 != null) {
                    if (!b5.equals(str) && currentTimeMillis - a6.a(c.f62394a) > 30000) {
                        x.a("try to upload crash on network changed.", new Object[0]);
                        c a8 = c.a();
                        if (a8 != null) {
                            a8.a(0L);
                        }
                        x.a("try to upload userinfo on network changed.", new Object[0]);
                        com.tencent.bugly.crashreport.biz.b.f62231a.b();
                    }
                    return true;
                }
                x.d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
