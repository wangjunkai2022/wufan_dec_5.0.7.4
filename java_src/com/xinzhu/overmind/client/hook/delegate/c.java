package com.xinzhu.overmind.client.hook.delegate;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;
import com.xinzhu.haunted.android.app.r;
import com.xinzhu.overmind.utils.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ServiceConnectionDelegate.java */
/* loaded from: classes.dex */
public class c extends IServiceConnection.Stub {

    /* renamed from: m  reason: collision with root package name */
    private static final Map<IBinder, c> f67599m = new HashMap();
    private ComponentName mComponentName;
    private IServiceConnection mConn;

    /* compiled from: ServiceConnectionDelegate.java */
    /* loaded from: classes6.dex */
    class a implements IBinder.DeathRecipient {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IBinder f67600b;

        a(IBinder iBinder) {
            this.f67600b = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            c.f67599m.remove(this.f67600b);
            this.f67600b.unlinkToDeath(this, 0);
        }
    }

    private c(IServiceConnection iServiceConnection, ComponentName componentName) {
        this.mConn = iServiceConnection;
        this.mComponentName = componentName;
    }

    public static IServiceConnection createProxy(IServiceConnection iServiceConnection, ComponentName componentName) {
        IBinder asBinder = iServiceConnection.asBinder();
        c cVar = f67599m.get(asBinder);
        if (cVar == null) {
            try {
                asBinder.linkToDeath(new a(asBinder), 0);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
            c cVar2 = new c(iServiceConnection, componentName);
            f67599m.put(asBinder, cVar2);
            return cVar2;
        }
        return cVar;
    }

    public static c getDelegate(IBinder iBinder) {
        return f67599m.get(iBinder);
    }

    @Override // android.app.IServiceConnection
    public void connected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        connected(componentName, iBinder, false);
    }

    public void connected(ComponentName componentName, IBinder iBinder, boolean z4) throws RemoteException {
        if (e.w()) {
            new r(this.mConn).b(this.mComponentName, iBinder, z4);
        } else {
            this.mConn.connected(componentName, iBinder);
        }
    }
}
