package org.repackage.com.zui.opendeviceidlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Objects;
import org.repackage.com.zui.deviceidservice.a;
/* compiled from: OpenDeviceId.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static String f73082e = "OpenDeviceId library";

    /* renamed from: f  reason: collision with root package name */
    private static boolean f73083f;

    /* renamed from: b  reason: collision with root package name */
    private org.repackage.com.zui.deviceidservice.a f73085b;

    /* renamed from: c  reason: collision with root package name */
    private ServiceConnection f73086c;

    /* renamed from: a  reason: collision with root package name */
    private Context f73084a = null;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0805b f73087d = null;

    /* compiled from: OpenDeviceId.java */
    /* loaded from: classes7.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f73085b = a.AbstractBinderC0803a.a(iBinder);
            if (b.this.f73087d != null) {
                b.this.f73087d.a("Deviceid Service Connected", b.this);
            }
            b.this.e("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f73085b = null;
            b.this.e("Service onServiceDisconnected");
        }
    }

    /* compiled from: OpenDeviceId.java */
    /* renamed from: org.repackage.com.zui.opendeviceidlibrary.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0805b<T> {
        void a(T t4, b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
    }

    private void i(String str) {
    }

    public int a(Context context, InterfaceC0805b<String> interfaceC0805b) {
        Objects.requireNonNull(context, "Context can not be null.");
        this.f73084a = context;
        this.f73087d = interfaceC0805b;
        this.f73086c = new a();
        Intent intent = new Intent();
        intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
        if (this.f73084a.bindService(intent, this.f73086c, 1)) {
            e("bindService Successful!");
            return 1;
        }
        e("bindService Failed!");
        return -1;
    }

    public String b() {
        if (this.f73084a != null) {
            try {
                org.repackage.com.zui.deviceidservice.a aVar = this.f73085b;
                if (aVar != null) {
                    return aVar.a();
                }
                return null;
            } catch (RemoteException e5) {
                i("getOAID error, RemoteException!");
                e5.printStackTrace();
                return null;
            }
        }
        i("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public void g(boolean z4) {
        f73083f = z4;
    }

    public String h() {
        if (this.f73084a != null) {
            try {
                org.repackage.com.zui.deviceidservice.a aVar = this.f73085b;
                if (aVar != null) {
                    return aVar.b();
                }
                return null;
            } catch (RemoteException e5) {
                i("getUDID error, RemoteException!");
                e5.printStackTrace();
                return null;
            } catch (Exception e6) {
                i("getUDID error, Exception!");
                e6.printStackTrace();
                return null;
            }
        }
        i("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public boolean j() {
        try {
            if (this.f73085b != null) {
                e("Device support opendeviceid");
                return this.f73085b.c();
            }
            return false;
        } catch (RemoteException unused) {
            i("isSupport error, RemoteException!");
            return false;
        }
    }

    public String k() {
        Context context = this.f73084a;
        if (context != null) {
            String packageName = context.getPackageName();
            e("liufeng, getVAID package：" + packageName);
            if (packageName != null && !packageName.equals("")) {
                try {
                    org.repackage.com.zui.deviceidservice.a aVar = this.f73085b;
                    if (aVar != null) {
                        return aVar.a(packageName);
                    }
                    return null;
                } catch (RemoteException e5) {
                    i("getVAID error, RemoteException!");
                    e5.printStackTrace();
                    return null;
                }
            }
            e("input package is null!");
            return null;
        }
        e("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public String l() {
        Context context = this.f73084a;
        if (context != null) {
            String packageName = context.getPackageName();
            e("liufeng, getAAID package：" + packageName);
            String str = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    org.repackage.com.zui.deviceidservice.a aVar = this.f73085b;
                    if (aVar != null) {
                        str = aVar.b(packageName);
                        return ((str == null || "".equals(str)) && this.f73085b.c(packageName)) ? this.f73085b.b(packageName) : str;
                    }
                    return null;
                } catch (RemoteException unused) {
                    i("getAAID error, RemoteException!");
                    return str;
                }
            }
            e("input package is null!");
            return null;
        }
        e("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public void m() {
        try {
            this.f73084a.unbindService(this.f73086c);
            e("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            i("unBind Service exception");
        }
        this.f73085b = null;
    }
}
