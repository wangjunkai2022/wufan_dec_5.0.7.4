package com.xinzhu.overmind.client.frameworks;

import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import com.xinzhu.overmind.server.os.a;
/* compiled from: MindDeviceManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f67550b = new c();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.os.a f67551a;

    public static c a() {
        return f67550b;
    }

    private com.xinzhu.overmind.server.os.a c() {
        com.xinzhu.overmind.server.os.a aVar = this.f67551a;
        if (aVar != null && aVar.asBinder().isBinderAlive()) {
            return this.f67551a;
        }
        this.f67551a = a.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f68001m));
        return c();
    }

    public MindDeviceInfo b(int i4) {
        try {
            if (Overmind.get().isVirtualProcess()) {
                String vPackageName = com.xinzhu.overmind.client.e.getVPackageName();
                int userId = com.xinzhu.overmind.client.e.getUserId();
                if (vPackageName == null || Overmind.get().ifDisableVirtualDeviceForPackage(vPackageName, userId)) {
                    return null;
                }
                return c().getDeviceInfo(i4);
            }
            return c().getDeviceInfo(i4);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void d(boolean z4) {
        try {
            c().setVirtualDeviceStatus(z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void e(int i4, MindDeviceInfo mindDeviceInfo) {
        try {
            c().updateMindDeviceInfo(i4, mindDeviceInfo);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
