package com.xinzhu.overmind.client.frameworks;

import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.c;
/* compiled from: MindNotificationManager.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static f f67557b = new f();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.os.c f67558a;

    public static f a() {
        return f67557b;
    }

    private com.xinzhu.overmind.server.os.c b() {
        com.xinzhu.overmind.server.os.c cVar = this.f67558a;
        if (cVar != null && cVar.asBinder().isBinderAlive()) {
            return this.f67558a;
        }
        this.f67558a = c.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67993e));
        return b();
    }

    public String c(String str, int i4, int i5, String str2) {
        try {
            return b().solveAddNotification(str, i4, i5, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void d(String str, int i4) {
        try {
            b().solveCancelAllNotifications(str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public String e(String str, int i4, int i5, String str2) {
        try {
            return b().solveCancelNotification(str, i4, i5, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
