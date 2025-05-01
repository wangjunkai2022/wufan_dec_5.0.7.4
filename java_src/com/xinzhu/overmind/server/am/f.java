package com.xinzhu.overmind.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.entity.PendingIntentRecord;
import com.xinzhu.overmind.entity.UnbindRecord;
import com.xinzhu.overmind.os.BinderHelper;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.am.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: MindActivityManagerService.java */
/* loaded from: classes.dex */
public class f extends d.b implements com.xinzhu.overmind.server.d {
    public static final String TAG = f.class.getSimpleName();
    private static f sService = new f();
    private final Map<Integer, i> mUserSpace = new HashMap();
    private final Map<IBinder, PendingIntentRecord> mPendingIntentRecords = new HashMap();

    public static f get() {
        return sService;
    }

    private i getOrCreateSpaceLocked(int i4) {
        synchronized (this.mUserSpace) {
            i iVar = this.mUserSpace.get(Integer.valueOf(i4));
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i();
            this.mUserSpace.put(Integer.valueOf(i4), iVar2);
            return iVar2;
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
        ProcessRecord q4 = com.xinzhu.overmind.server.e.d().q(providerInfo.packageName, providerInfo.processName, com.xinzhu.overmind.server.e.d().h(Binder.getCallingPid()), -1, Binder.getCallingUid(), Binder.getCallingPid());
        if (q4 != null) {
            return q4.client.acquireContentProviderClient(providerInfo);
        }
        throw new RuntimeException("Unable to create process " + providerInfo.name);
    }

    @Override // com.xinzhu.overmind.server.am.d
    public Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) throws RemoteException {
        Intent bindService;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            bindService = orCreateSpaceLocked.f67941a.bindService(intent, iBinder, str, i4, i5);
        }
        return bindService;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public PendingIntentRecord findPendingIntent(IBinder iBinder) throws RemoteException {
        try {
            PendingIntentRecord pendingIntentRecord = this.mPendingIntentRecords.get(iBinder);
            if (pendingIntentRecord != null) {
                String str = TAG;
                com.xinzhu.overmind.b.c(str, "try findPendingIntent result " + pendingIntentRecord + " realIntent: " + pendingIntentRecord.f67778f + " uid: " + pendingIntentRecord.f67775c);
                return pendingIntentRecord;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public ProcessRecord findProcessRecordByPid(int i4) throws RemoteException {
        return com.xinzhu.overmind.server.e.d().b(i4);
    }

    @Override // com.xinzhu.overmind.server.am.d
    public ComponentName getCallingActivity(IBinder iBinder) throws RemoteException {
        ComponentName j4;
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return null;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            j4 = orCreateSpaceLocked.f67942b.j(b5.userId, iBinder);
        }
        return j4;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public String getCallingPackage(IBinder iBinder) throws RemoteException {
        String k4;
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return null;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            k4 = orCreateSpaceLocked.f67942b.k(b5.userId, iBinder);
        }
        return k4;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public String getLaunchedFromPackage(IBinder iBinder) throws RemoteException {
        String l4;
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return null;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            l4 = orCreateSpaceLocked.f67942b.l(iBinder);
        }
        return l4;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public int getLaunchedFromUid(IBinder iBinder) throws RemoteException {
        int m4;
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return -1;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            m4 = orCreateSpaceLocked.f67942b.m(iBinder);
        }
        return m4;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public MindTaskInfo getTaskInfo(int i4) throws RemoteException {
        List<b> list;
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return null;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            h g4 = orCreateSpaceLocked.f67942b.g(i4);
            if (g4 != null && (list = g4.f67940e) != null) {
                int size = list.size();
                if (size == 0) {
                    return null;
                }
                ComponentName componentName = g4.f67940e.get(size - 1).component;
                Intent intent = g4.f67939d;
                return new MindTaskInfo(i4, intent, intent.getComponent(), componentName);
            }
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public ClientConfig initProcess(String str, String str2, int i4) throws RemoteException {
        ProcessRecord q4 = com.xinzhu.overmind.server.e.d().q(str, str2, i4, -1, Binder.getCallingUid(), Binder.getCallingPid());
        if (q4 == null) {
            return null;
        }
        return q4.getClientConfig();
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onActivityCreated(int i4, IBinder iBinder, IBinder iBinder2) throws RemoteException {
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return;
        }
        b bVar = (b) iBinder2;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.s(b5, i4, iBinder, bVar);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onActivityDestroyed(IBinder iBinder) throws RemoteException {
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.t(b5.userId, iBinder);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onActivityResumed(IBinder iBinder) throws RemoteException {
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.u(b5.userId, iBinder);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onFinishActivity(IBinder iBinder) throws RemoteException {
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.v(b5.userId, iBinder);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onFinishActivityAffinity(IBinder iBinder) throws RemoteException {
        ProcessRecord b5 = com.xinzhu.overmind.server.e.d().b(Binder.getCallingPid());
        if (b5 == null) {
            return;
        }
        i orCreateSpaceLocked = getOrCreateSpaceLocked(b5.userId);
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.w(b5.userId, iBinder);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onServiceDestroy(Intent intent, int i4) throws RemoteException {
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            orCreateSpaceLocked.f67941a.f(intent, i4);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public UnbindRecord onServiceUnbind(Intent intent, int i4) throws RemoteException {
        UnbindRecord g4;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            g4 = orCreateSpaceLocked.f67941a.g(intent, i4);
        }
        return g4;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void onStartCommand(Intent intent, int i4) throws RemoteException {
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            orCreateSpaceLocked.f67941a.h(intent, i4);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public IBinder peekService(Intent intent, String str, int i4) throws RemoteException {
        IBinder i5;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            i5 = orCreateSpaceLocked.f67941a.i(intent, str, i4);
        }
        return i5;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void registerPendingIntent(PendingIntentRecord pendingIntentRecord) throws RemoteException {
        this.mPendingIntentRecords.put(pendingIntentRecord.f67777e, pendingIntentRecord);
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void restartProcess(String str, String str2, int i4) throws RemoteException {
        com.xinzhu.overmind.server.e.d().o(str, str2, i4);
    }

    @Override // com.xinzhu.overmind.server.am.d
    public Intent sendBroadcast(Intent intent, String str, int i4) throws RemoteException {
        for (ResolveInfo resolveInfo : com.xinzhu.overmind.server.pm.i.get().queryIntentBroadcastReceivers(intent, 128, str, i4)) {
            com.xinzhu.overmind.server.e d5 = com.xinzhu.overmind.server.e.d();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ProcessRecord q4 = d5.q(activityInfo.packageName, activityInfo.processName, i4, -1, Binder.getCallingUid(), Binder.getCallingPid());
            if (q4 != null) {
                try {
                    q4.client.bindApplication();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (intent.getPackage() != null) {
            intent.setPackage(Overmind.getHostPkg());
        }
        return intent;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public int startActivities(int i4, String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException {
        int A;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        synchronized (orCreateSpaceLocked.f67942b) {
            A = orCreateSpaceLocked.f67942b.A(i4, str, b5.f67823c, intentArr, strArr, iBinder, bundle);
        }
        return A;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void startActivity(Intent intent, int i4) {
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        synchronized (orCreateSpaceLocked.f67942b) {
            orCreateSpaceLocked.f67942b.E(i4, null, b5.f67823c, intent, null, null, null, -1, 0, null, true);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public int startActivityAms(int i4, String str, Intent intent, String str2, IBinder iBinder, String str3, int i5, int i6, Bundle bundle) throws RemoteException {
        int E;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        synchronized (orCreateSpaceLocked.f67942b) {
            E = orCreateSpaceLocked.f67942b.E(i4, str, b5.f67823c, intent, str2, iBinder, str3, i5, i6, bundle, false);
        }
        return E;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public int startActivityFromExistTask(Intent intent, int i4) throws RemoteException {
        int B;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67942b) {
            B = orCreateSpaceLocked.f67942b.B(intent);
        }
        return B;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public Intent startService(Intent intent, String str, int i4, int i5) {
        Intent startService;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            startService = orCreateSpaceLocked.f67941a.startService(intent, str, i4, i5);
        }
        return startService;
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void stopPackage(String str, int i4) throws RemoteException {
        com.xinzhu.overmind.server.e.d().l(str, i4);
    }

    @Override // com.xinzhu.overmind.server.am.d
    public Intent stopService(Intent intent, String str, int i4) {
        Intent stopService;
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            stopService = orCreateSpaceLocked.f67941a.stopService(intent, str, i4);
        }
        return stopService;
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void unbindService(IBinder iBinder, int i4) throws RemoteException {
        i orCreateSpaceLocked = getOrCreateSpaceLocked(i4);
        synchronized (orCreateSpaceLocked.f67941a) {
            orCreateSpaceLocked.f67941a.unbindService(iBinder, i4);
        }
    }

    @Override // com.xinzhu.overmind.server.am.d
    public void unregisterPendingIntent(IBinder iBinder) throws RemoteException {
        this.mPendingIntentRecords.remove(iBinder);
    }
}
