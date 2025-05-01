package com.beizi.fusion.sm.a.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: OAIDService.java */
/* loaded from: classes2.dex */
class m implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7101a;

    /* renamed from: b  reason: collision with root package name */
    private final com.beizi.fusion.sm.a.c f7102b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7103c;

    /* compiled from: OAIDService.java */
    @FunctionalInterface
    /* loaded from: classes2.dex */
    public interface a {
        String a(IBinder iBinder) throws com.beizi.fusion.sm.a.e, RemoteException;
    }

    private m(Context context, com.beizi.fusion.sm.a.c cVar, a aVar) {
        if (context instanceof Application) {
            this.f7101a = context;
        } else {
            this.f7101a = context.getApplicationContext();
        }
        this.f7102b = cVar;
        this.f7103c = aVar;
    }

    public static void a(Context context, Intent intent, com.beizi.fusion.sm.a.c cVar, a aVar) {
        new m(context, cVar, aVar).a(intent);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.beizi.fusion.sm.a.f.a("Service has been connected: " + componentName.getClassName());
        try {
            try {
                try {
                    String a5 = this.f7103c.a(iBinder);
                    if (a5 != null && a5.length() != 0) {
                        com.beizi.fusion.sm.a.f.a("OAID acquire success: " + a5);
                        this.f7102b.a(a5);
                        this.f7101a.unbindService(this);
                        com.beizi.fusion.sm.a.f.a("Service has been unbound: " + componentName.getClassName());
                        return;
                    }
                    throw new com.beizi.fusion.sm.a.e("OAID acquire failed");
                } catch (Exception e5) {
                    com.beizi.fusion.sm.a.f.a(e5);
                }
            } catch (Exception e6) {
                com.beizi.fusion.sm.a.f.a(e6);
                this.f7102b.a(e6);
                this.f7101a.unbindService(this);
                com.beizi.fusion.sm.a.f.a("Service has been unbound: " + componentName.getClassName());
            }
        } catch (Throwable th) {
            try {
                this.f7101a.unbindService(this);
                com.beizi.fusion.sm.a.f.a("Service has been unbound: " + componentName.getClassName());
            } catch (Exception e7) {
                com.beizi.fusion.sm.a.f.a(e7);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        com.beizi.fusion.sm.a.f.a("Service has been disconnected: " + componentName.getClassName());
    }

    private void a(Intent intent) {
        try {
            if (this.f7101a.bindService(intent, this, 1)) {
                com.beizi.fusion.sm.a.f.a("Service has been bound: " + intent);
                return;
            }
            throw new com.beizi.fusion.sm.a.e("Service binding failed");
        } catch (Exception e5) {
            this.f7102b.a(e5);
        }
    }
}
