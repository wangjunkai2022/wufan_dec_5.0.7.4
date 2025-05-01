package com.xinzhu.overmind.server;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.xinzhu.haunted.android.app.k;
import com.xinzhu.haunted.android.app.q;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.c;
import com.xinzhu.overmind.client.stub.StubContentProvider;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.server.user.MindUserHandle;
import com.xinzhu.overmind.utils.v;
import com.xinzhu.overmind.utils.wrappers.ContentProviderWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: MindProcessManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: e  reason: collision with root package name */
    public static final String f67967e = "MindProcessManager";

    /* renamed from: f  reason: collision with root package name */
    public static e f67968f = new e();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, Map<String, ProcessRecord>> f67969a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, ProcessRecord> f67970b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f67971c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f67972d = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindProcessManager.java */
    /* loaded from: classes6.dex */
    public class a implements IBinder.DeathRecipient {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProcessRecord f67973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IBinder f67974c;

        a(ProcessRecord processRecord, IBinder iBinder) {
            this.f67973b = processRecord;
            this.f67974c = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            StringBuilder sb = new StringBuilder();
            sb.append("Client Died: ");
            sb.append(this.f67973b.processName);
            this.f67974c.unlinkToDeath(this, 0);
            e.this.m(this.f67973b);
        }
    }

    private void a(ProcessRecord processRecord, IBinder iBinder, int i4) {
        com.xinzhu.overmind.client.c asInterface = c.b.asInterface(iBinder);
        if (asInterface == null) {
            processRecord.kill();
            return;
        }
        try {
            iBinder.linkToDeath(new a(processRecord, iBinder), 0);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
        processRecord.client = asInterface;
        processRecord.pid = i4;
        try {
            if (com.xinzhu.overmind.utils.e.w()) {
                processRecord.appThread = q.a.a(asInterface.getActivityThread());
            } else {
                processRecord.appThread = k.a(asInterface.getActivityThread());
            }
        } catch (RemoteException e6) {
            e6.printStackTrace();
        }
        processRecord.initLock.open();
    }

    public static e d() {
        return f67968f;
    }

    public static int e(String str) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : Overmind.get().getRunningAppProcessesContainPlugin()) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    private static String f(int i4) {
        String str;
        Iterator<ActivityManager.RunningAppProcessInfo> it2 = Overmind.get().getRunningAppProcessesContainPlugin().iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it2.next();
            if (next.pid == i4) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException("processName = null");
    }

    private int i() {
        boolean z4;
        for (int i4 = 0; i4 < 100; i4++) {
            Iterator<ProcessRecord> it2 = this.f67970b.values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().vpid == i4) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                return i4;
            }
        }
        return -1;
    }

    private boolean j(ProcessRecord processRecord) {
        StringBuilder sb = new StringBuilder();
        sb.append("initProcess: ");
        sb.append(processRecord.processName);
        ClientConfig clientConfig = processRecord.getClientConfig();
        Bundle bundle = new Bundle();
        bundle.putParcelable(StubContentProvider.f67751c, clientConfig);
        Bundle acquire = ContentProviderWrapper.acquire(processRecord.getProviderAuthority(), StubContentProvider.f67750b, null, bundle);
        IBinder b5 = com.xinzhu.overmind.utils.helpers.d.b(acquire, StubContentProvider.f67752d);
        int i4 = acquire.getInt(StubContentProvider.f67753e);
        if (b5 == null || !b5.isBinderAlive()) {
            return false;
        }
        a(processRecord, b5, i4);
        return true;
    }

    private int n(String str) {
        if (str == null) {
            return -1;
        }
        String str2 = Overmind.getHostPkg() + ":p";
        if (str.startsWith(str2)) {
            try {
                return Integer.parseInt(str.substring(str2.length()));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private void p() {
    }

    public ProcessRecord b(int i4) {
        ProcessRecord processRecord;
        if (i4 == Process.myPid()) {
            return new ProcessRecord(null, null, 1000, 0, 0);
        }
        synchronized (this.f67970b) {
            processRecord = this.f67970b.get(Integer.valueOf(i4));
        }
        return processRecord;
    }

    public ProcessRecord c(String str, String str2, int i4) {
        synchronized (this.f67971c) {
            Map<String, ProcessRecord> map = this.f67969a.get(Integer.valueOf(MindUserHandle.h(i4, com.xinzhu.overmind.server.pm.i.get().getAppId(str))));
            if (map == null) {
                return null;
            }
            return map.get(str2);
        }
    }

    public Map<Integer, ProcessRecord> g() {
        return this.f67970b;
    }

    public int h(int i4) {
        synchronized (this.f67971c) {
            ProcessRecord b5 = d().b(i4);
            if (b5 == null) {
                return 0;
            }
            return b5.userId;
        }
    }

    public void k(String str) {
        synchronized (this.f67971c) {
            synchronized (this.f67970b) {
                HashMap hashMap = new HashMap(this.f67970b);
                int appId = com.xinzhu.overmind.server.pm.i.get().getAppId(str);
                for (ProcessRecord processRecord : this.f67970b.values()) {
                    if (appId == MindUserHandle.a(processRecord.vuid)) {
                        this.f67969a.remove(Integer.valueOf(processRecord.vuid));
                        hashMap.remove(Integer.valueOf(processRecord.pid));
                        processRecord.kill();
                    }
                }
                this.f67970b.clear();
                this.f67970b.putAll(hashMap);
            }
        }
    }

    public void l(String str, int i4) {
        synchronized (this.f67971c) {
            Map<String, ProcessRecord> map = this.f67969a.get(Integer.valueOf(MindUserHandle.h(i4, com.xinzhu.overmind.server.pm.i.get().getAppId(str))));
            if (map == null) {
                return;
            }
            for (ProcessRecord processRecord : map.values()) {
                if (processRecord.runWithPlugin) {
                    com.xinzhu.overmind.plugin.b.l(processRecord.pid);
                } else {
                    processRecord.kill();
                }
            }
        }
    }

    public void m(ProcessRecord processRecord) {
        synchronized (this.f67971c) {
            processRecord.kill();
            Map<String, ProcessRecord> map = this.f67969a.get(Integer.valueOf(processRecord.vuid));
            if (map != null) {
                map.remove(processRecord.processName);
            }
            this.f67970b.remove(Integer.valueOf(processRecord.pid));
        }
    }

    public void o(String str, String str2, int i4) {
        ProcessRecord b5;
        synchronized (this.f67971c) {
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            synchronized (this.f67971c) {
                b5 = b(callingPid);
            }
            if (b5 == null) {
                q(str, str2, i4, n(f(callingPid)), callingUid, callingPid);
            }
        }
    }

    public ProcessRecord q(String str, String str2, int i4, int i5, int i6, int i7) {
        p();
        ApplicationInfo applicationInfo = com.xinzhu.overmind.server.pm.i.get().getApplicationInfo(str, 0, i4);
        ProcessRecord processRecord = null;
        if (applicationInfo == null) {
            return null;
        }
        int h4 = MindUserHandle.h(i4, com.xinzhu.overmind.server.pm.i.get().getAppId(str));
        Map<String, ProcessRecord> map = this.f67969a.get(Integer.valueOf(h4));
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, ProcessRecord> map2 = map;
        synchronized (this.f67971c) {
            if (i5 == -1) {
                try {
                    ProcessRecord processRecord2 = map2.get(str2);
                    if (processRecord2 != null) {
                        ConditionVariable conditionVariable = processRecord2.initLock;
                        if (conditionVariable != null) {
                            conditionVariable.block();
                        }
                        if (processRecord2.client != null) {
                            return processRecord2;
                        }
                    }
                    i5 = i();
                    v.a(f67967e, "init vUid = " + h4 + ", vPid = " + i5);
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i8 = i5;
            if (i8 != -1) {
                ProcessRecord processRecord3 = new ProcessRecord(applicationInfo, str2, 0, i8, i6);
                processRecord3.uid = h4;
                processRecord3.vuid = h4;
                processRecord3.userId = i4;
                processRecord3.baseVUid = MindUserHandle.a(h4);
                processRecord3.runWithPlugin = com.xinzhu.overmind.server.pm.i.get().getMindPackageSettings(str).k();
                map2.put(str2, processRecord3);
                this.f67969a.put(Integer.valueOf(processRecord3.vuid), map2);
                if (!j(processRecord3)) {
                    map2.remove(str2);
                } else {
                    int e5 = e(com.xinzhu.overmind.client.f.d(processRecord3.vpid, processRecord3.runWithPlugin));
                    processRecord3.pid = e5;
                    this.f67970b.put(Integer.valueOf(e5), processRecord3);
                    processRecord = processRecord3;
                }
                return processRecord;
            }
            throw new RuntimeException("No processes available");
        }
    }
}
