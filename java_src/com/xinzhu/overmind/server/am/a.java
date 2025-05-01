package com.xinzhu.overmind.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.stub.record.StubServiceRecord;
import com.xinzhu.overmind.entity.UnbindRecord;
import com.xinzhu.overmind.server.ProcessRecord;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ActiveServices.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67917c = "ActiveServices";

    /* renamed from: a  reason: collision with root package name */
    private final Map<Intent.FilterComparison, c> f67918a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<IBinder, b> f67919b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveServices.java */
    /* renamed from: com.xinzhu.overmind.server.am.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C0751a implements IBinder.DeathRecipient {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IBinder f67920b;

        C0751a(IBinder iBinder) {
            this.f67920b = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f67920b.unlinkToDeath(this, 0);
            a.this.f67919b.remove(this.f67920b);
        }
    }

    /* compiled from: ActiveServices.java */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f67922a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f67923b;
    }

    /* compiled from: ActiveServices.java */
    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f67924a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private AtomicInteger f67925b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        private b f67926c;

        /* renamed from: d  reason: collision with root package name */
        private Intent f67927d;

        public int g() {
            return this.f67925b.decrementAndGet();
        }

        public int h() {
            return this.f67924a.getAndIncrement();
        }

        public int i() {
            return this.f67925b.incrementAndGet();
        }
    }

    private Intent b(Intent intent, ServiceInfo serviceInfo, ProcessRecord processRecord, int i4, int i5) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(processRecord.runWithPlugin ? Overmind.getPluginPkg() : Overmind.getMainPkg(), com.xinzhu.overmind.client.f.m(processRecord.vpid)));
        intent2.setAction(UUID.randomUUID().toString());
        StubServiceRecord.saveStub(intent2, intent, serviceInfo, processRecord.userId, i4, i5);
        return intent2;
    }

    private b c(Intent intent) {
        c cVar = this.f67918a.get(intent);
        if (cVar == null) {
            return null;
        }
        return cVar.f67926c;
    }

    private c d(Intent intent) {
        return this.f67918a.get(new Intent.FilterComparison(intent));
    }

    private c e(Intent intent) {
        c d5 = d(intent);
        if (d5 == null) {
            c cVar = new c();
            this.f67918a.put(new Intent.FilterComparison(intent), cVar);
            return cVar;
        }
        return d5;
    }

    private ResolveInfo j(Intent intent, String str, int i4) {
        return com.xinzhu.overmind.server.pm.i.get().resolveService(intent, 0, str, i4);
    }

    public Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) {
        c e5;
        ResolveInfo j4 = j(intent, str, i4);
        if (j4 == null) {
            return intent;
        }
        ServiceInfo serviceInfo = j4.serviceInfo;
        ProcessRecord q4 = com.xinzhu.overmind.server.e.d().q(serviceInfo.packageName, serviceInfo.processName, i4, -1, Binder.getCallingUid(), Binder.getCallingPid());
        if (q4 != null) {
            synchronized (this.f67918a) {
                e5 = e(intent);
                if (iBinder != null) {
                    b bVar = this.f67919b.get(iBinder);
                    boolean z4 = false;
                    if (bVar != null) {
                        z4 = true;
                    } else {
                        bVar = new b();
                        try {
                            iBinder.linkToDeath(new C0751a(iBinder), 0);
                        } catch (RemoteException e6) {
                            e6.printStackTrace();
                        }
                        bVar.f67922a = iBinder;
                        bVar.f67923b = intent;
                        this.f67919b.put(iBinder, bVar);
                    }
                    if (!z4) {
                        e5.i();
                    }
                    e5.f67926c = bVar;
                }
            }
            Intent b5 = b(intent, serviceInfo, q4, e5.f67924a.get(), i5);
            e5.f67927d = b5;
            return b5;
        }
        throw new RuntimeException("Unable to create " + serviceInfo.name);
    }

    public void f(Intent intent, int i4) {
        if (intent == null) {
            return;
        }
        this.f67918a.remove(new Intent.FilterComparison(StubServiceRecord.create(intent).mServiceIntent));
    }

    public UnbindRecord g(Intent intent, int i4) throws RemoteException {
        if (intent == null) {
            return null;
        }
        StubServiceRecord create = StubServiceRecord.create(intent);
        ComponentName component = create.mServiceIntent.getComponent();
        c d5 = d(create.mServiceIntent);
        if (d5 == null) {
            return null;
        }
        UnbindRecord unbindRecord = new UnbindRecord();
        unbindRecord.f(component);
        unbindRecord.e(d5.f67925b.get());
        unbindRecord.g(d5.f67924a.get());
        return unbindRecord;
    }

    public void h(Intent intent, int i4) {
    }

    public IBinder i(Intent intent, String str, int i4) {
        ResolveInfo j4 = j(intent, str, i4);
        if (j4 == null) {
            return null;
        }
        com.xinzhu.overmind.server.e d5 = com.xinzhu.overmind.server.e.d();
        ServiceInfo serviceInfo = j4.serviceInfo;
        ProcessRecord c5 = d5.c(serviceInfo.packageName, serviceInfo.processName, i4);
        if (c5 == null) {
            return null;
        }
        try {
            return c5.client.peekService(intent);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public Intent startService(Intent intent, String str, int i4, int i5) {
        ResolveInfo j4 = j(intent, str, i4);
        if (j4 == null) {
            return null;
        }
        ServiceInfo serviceInfo = j4.serviceInfo;
        ProcessRecord q4 = com.xinzhu.overmind.server.e.d().q(serviceInfo.packageName, serviceInfo.processName, i4, -1, Binder.getCallingUid(), Binder.getCallingPid());
        if (q4 != null) {
            c e5 = e(intent);
            Intent b5 = b(intent, serviceInfo, q4, e5.h(), i5);
            e5.f67927d = b5;
            return b5;
        }
        throw new RuntimeException("Unable to create " + serviceInfo.name);
    }

    public Intent stopService(Intent intent, String str, int i4) {
        synchronized (this.f67918a) {
            c d5 = d(intent);
            if (d5 == null) {
                return null;
            }
            if (d5.f67925b.get() > 0) {
                return null;
            }
            d5.f67924a.set(0);
            return d5.f67927d;
        }
    }

    public void unbindService(IBinder iBinder, int i4) {
        b bVar = this.f67919b.get(iBinder);
        if (bVar == null) {
            return;
        }
        c e5 = e(bVar.f67923b);
        e5.f67926c = null;
        e5.g();
        this.f67919b.remove(iBinder);
    }
}
