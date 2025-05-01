package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.umeng.analytics.pro.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: CoolpadDeviceIdSupplier.java */
/* loaded from: classes6.dex */
public class az implements ax {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63403a = "Coolpad";

    /* renamed from: b  reason: collision with root package name */
    private static final String f63404b = "com.coolpad.deviceidsupport";

    /* renamed from: c  reason: collision with root package name */
    private static final String f63405c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* renamed from: d  reason: collision with root package name */
    private static a f63406d;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f63408f;

    /* renamed from: g  reason: collision with root package name */
    private Context f63409g;

    /* renamed from: e  reason: collision with root package name */
    private String f63407e = "";

    /* renamed from: h  reason: collision with root package name */
    private final ServiceConnection f63410h = new ServiceConnection() { // from class: com.umeng.analytics.pro.az.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a unused = az.f63406d = a.b.a(iBinder);
                az.this.f63407e = az.f63406d.b(az.this.f63409g.getPackageName());
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected: oaid = ");
                sb.append(az.this.f63407e);
            } catch (RemoteException | NullPointerException e5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onServiceConnected failed e=");
                sb2.append(e5.getMessage());
            }
            az.this.f63408f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a unused = az.f63406d = null;
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(f63404b, f63405c));
            context.bindService(intent, this.f63410h, 1);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("bindService failed. e=");
            sb.append(th.getMessage());
            this.f63408f.countDown();
        }
    }

    private void c(Context context) {
        try {
            context.unbindService(this.f63410h);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("unbindService failed. e=");
            sb.append(th.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.f63409g = context.getApplicationContext();
        this.f63408f = new CountDownLatch(1);
        try {
            b(context);
            this.f63408f.await(500L, TimeUnit.MILLISECONDS);
            return this.f63407e;
        } catch (InterruptedException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("getOAID interrupted. e=");
            sb.append(e5.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
