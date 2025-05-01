package com.xinzhu.overmind.client.frameworks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.entity.PendingIntentRecord;
import com.xinzhu.overmind.entity.UnbindRecord;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.am.MindTaskInfo;
import com.xinzhu.overmind.server.am.d;
/* compiled from: MindActivityManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f67482b = new a();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.am.d f67483a;

    public static a d() {
        return f67482b;
    }

    private com.xinzhu.overmind.server.am.d i() {
        com.xinzhu.overmind.server.am.d dVar = this.f67483a;
        if (dVar != null && dVar.asBinder().isBinderAlive()) {
            return this.f67483a;
        }
        this.f67483a = d.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67991c));
        return i();
    }

    public int A(String str, int i4) {
        try {
            i().stopPackage(str, i4);
            return 0;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public void B(IBinder iBinder) throws RemoteException {
        try {
            i().unregisterPendingIntent(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public IBinder a(ProviderInfo providerInfo) {
        try {
            return i().acquireContentProviderClient(providerInfo);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public PendingIntentRecord b(IBinder iBinder) throws RemoteException {
        try {
            return i().findPendingIntent(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) {
        try {
            return i().bindService(intent, iBinder, str, i4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ProcessRecord c(int i4) throws RemoteException {
        try {
            return i().findProcessRecordByPid(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ComponentName e(IBinder iBinder) {
        try {
            return i().getCallingActivity(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String f(IBinder iBinder) {
        try {
            return i().getCallingPackage(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String g(IBinder iBinder) {
        try {
            return i().getLaunchedFromPackage(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public int h(IBinder iBinder) {
        try {
            return i().getLaunchedFromUid(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public MindTaskInfo j(int i4) throws RemoteException {
        try {
            return i().getTaskInfo(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ClientConfig k(String str, String str2, int i4) {
        try {
            return i().initProcess(str, str2, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void l(int i4, IBinder iBinder, IBinder iBinder2) {
        try {
            i().onActivityCreated(i4, iBinder, iBinder2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void m(IBinder iBinder) {
        try {
            i().onActivityDestroyed(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void n(IBinder iBinder) {
        try {
            i().onActivityResumed(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void o(IBinder iBinder) {
        try {
            i().onFinishActivity(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void p(IBinder iBinder) {
        try {
            i().onFinishActivityAffinity(iBinder);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void q(Intent intent, int i4) {
        try {
            i().onServiceDestroy(intent, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public UnbindRecord r(Intent intent, int i4) {
        try {
            return i().onServiceUnbind(intent, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void s(Intent intent, int i4) {
        try {
            i().onStartCommand(intent, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void startActivity(Intent intent, int i4) {
        try {
            i().startActivity(intent, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public Intent startService(Intent intent, String str, int i4, int i5) {
        try {
            return i().startService(intent, str, i4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public Intent stopService(Intent intent, String str, int i4) {
        try {
            return i().stopService(intent, str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public IBinder t(Intent intent, String str, int i4) {
        try {
            return i().peekService(intent, str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void u(PendingIntentRecord pendingIntentRecord) throws RemoteException {
        try {
            i().registerPendingIntent(pendingIntentRecord);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void unbindService(IBinder iBinder, int i4) {
        try {
            i().unbindService(iBinder, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void v(String str, String str2, int i4) {
        try {
            i().restartProcess(str, str2, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public Intent w(Intent intent, String str, int i4) {
        try {
            return i().sendBroadcast(intent, str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public int x(int i4, String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        try {
            return i().startActivities(i4, str, intentArr, strArr, iBinder, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public int y(int i4, String str, Intent intent, String str2, IBinder iBinder, String str3, int i5, int i6, Bundle bundle) {
        try {
            return i().startActivityAms(i4, str, intent, str2, iBinder, str3, i5, i6, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public void z(Intent intent, int i4) {
        try {
            i().startActivityFromExistTask(intent, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
