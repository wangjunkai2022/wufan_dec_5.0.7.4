package com.xinzhu.overmind.server.am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.xinzhu.haunted.android.app.m;
import com.xinzhu.haunted.android.app.q;
import com.xinzhu.haunted.com.android.internal.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.stub.record.StubActivityRecord;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.utils.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: ActivityStack.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static String f67928d = "c";

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, h> f67930b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Set<b> f67931c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f67929a = (ActivityManager) Overmind.getContext().getSystemService(TTDownloadField.TT_ACTIVITY);

    private int C(int i4, String str, int i5, Intent intent, ActivityInfo activityInfo, String str2, IBinder iBinder, String str3, int i6, int i7, int i8, Bundle bundle, boolean z4) {
        Intent F = F(i4, intent, activityInfo, r(intent, activityInfo, iBinder, i4, str, i5), Process.myUid());
        if (z4) {
            F.addFlags(134217728);
            F.addFlags(524288);
            F.addFlags(268435456);
        }
        F.addFlags(i7);
        z(q.a.a(new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).K()), F, str2, iBinder, str3, i6, i8, bundle);
        return 0;
    }

    private int D(Intent intent, String str, IBinder iBinder, String str2, int i4, int i5, Bundle bundle, int i6, String str3, int i7, b bVar, ActivityInfo activityInfo, int i8) {
        b r4 = r(intent, activityInfo, iBinder, i6, str3, i7);
        r4.task = bVar.task;
        r4.processRecord = bVar.processRecord;
        Intent F = F(i6, intent, activityInfo, r4, Process.myUid());
        F.addFlags(i8);
        return z(bVar.processRecord.appThread, F, str, iBinder, str2, i4, i5, bundle);
    }

    private Intent F(int i4, Intent intent, ActivityInfo activityInfo, b bVar, int i5) {
        StubActivityRecord stubActivityRecord = new StubActivityRecord(i4, activityInfo, intent, bVar);
        ProcessRecord q4 = com.xinzhu.overmind.server.e.d().q(activityInfo.packageName, activityInfo.processName, i4, -1, Binder.getCallingUid(), Binder.getCallingPid());
        if (q4 != null) {
            return n(intent, q4.vpid, i4, stubActivityRecord, activityInfo, q4.runWithPlugin);
        }
        throw new RuntimeException("Unable to create process, name:" + activityInfo.name);
    }

    private void G() {
        List<ActivityManager.RecentTaskInfo> recentTasksContainPlugin = Overmind.get().getRecentTasksContainPlugin(100, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int size = recentTasksContainPlugin.size() - 1; size >= 0; size--) {
            ActivityManager.RecentTaskInfo recentTaskInfo = recentTasksContainPlugin.get(size);
            h hVar = this.f67930b.get(Integer.valueOf(recentTaskInfo.id));
            if (hVar != null) {
                linkedHashMap.put(Integer.valueOf(recentTaskInfo.id), hVar);
            }
        }
        this.f67930b.clear();
        this.f67930b.putAll(linkedHashMap);
    }

    private void b(b bVar, Intent intent) {
        try {
            bVar.processRecord.client.handleNewIntent(bVar.token, intent);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    private void c(int i4) {
        for (h hVar : this.f67930b.values()) {
            Iterator<b> it2 = hVar.f67940e.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next.finished) {
                    try {
                        next.processRecord.client.finishActivity(next.token);
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                    it2.remove();
                }
            }
        }
    }

    private b d(int i4, ComponentName componentName) {
        b bVar = null;
        for (h hVar : this.f67930b.values()) {
            if (i4 == hVar.f67937b) {
                Iterator<b> it2 = hVar.f67940e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b next = it2.next();
                        if (next.component.equals(componentName)) {
                            bVar = next;
                            break;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    private b e(int i4, IBinder iBinder) {
        b bVar = null;
        if (iBinder != null) {
            for (h hVar : this.f67930b.values()) {
                if (i4 == hVar.f67937b) {
                    Iterator<b> it2 = hVar.f67940e.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            b next = it2.next();
                            if (next.token == iBinder) {
                                bVar = next;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bVar;
    }

    private b f(IBinder iBinder) {
        b bVar = null;
        if (iBinder != null) {
            for (h hVar : this.f67930b.values()) {
                Iterator<b> it2 = hVar.f67940e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b next = it2.next();
                        if (next.token == iBinder) {
                            bVar = next;
                            break;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    private h h(int i4, String str) {
        synchronized (this.f67930b) {
            for (h hVar : this.f67930b.values()) {
                if (i4 == hVar.f67937b && hVar.f67938c.equals(str)) {
                    return hVar;
                }
            }
            return null;
        }
    }

    private h i(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            for (h hVar : this.f67930b.values()) {
                if (i4 == hVar.f67937b) {
                    for (b bVar : hVar.f67940e) {
                        if (bVar.token == iBinder) {
                            return hVar;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private Intent n(Intent intent, int i4, int i5, StubActivityRecord stubActivityRecord, ActivityInfo activityInfo, boolean z4) {
        Intent intent2 = new Intent();
        boolean p4 = p(activityInfo, i5);
        boolean q4 = q(activityInfo);
        String pluginPkg = z4 ? Overmind.getPluginPkg() : Overmind.getHostPkg();
        if (p4) {
            if (!q4) {
                intent2.setComponent(new ComponentName(pluginPkg, com.xinzhu.overmind.client.f.i(i4)));
            } else {
                intent2.setComponent(new ComponentName(pluginPkg, com.xinzhu.overmind.client.f.j(i4)));
            }
        } else if (!q4) {
            intent2.setComponent(new ComponentName(pluginPkg, com.xinzhu.overmind.client.f.e(i4)));
        } else {
            intent2.setComponent(new ComponentName(pluginPkg, com.xinzhu.overmind.client.f.f(i4)));
        }
        StubActivityRecord.saveStub(intent2, intent, stubActivityRecord.mActivityInfo, stubActivityRecord.mActivityRecord, stubActivityRecord.mUserId);
        intent2.setType(intent.toString());
        return intent2;
    }

    private b o() {
        synchronized (this.f67930b) {
            G();
        }
        LinkedList linkedList = new LinkedList(this.f67930b.values());
        if (linkedList.isEmpty()) {
            return null;
        }
        return ((h) linkedList.get(linkedList.size() - 1)).b();
    }

    private boolean p(ActivityInfo activityInfo, int i4) {
        try {
            Resources appResources = com.xinzhu.overmind.server.pm.i.get().getAppResources(activityInfo.packageName, i4);
            if (appResources != null) {
                TypedArray obtainStyledAttributes = appResources.newTheme().obtainStyledAttributes(activityInfo.theme, a.e.R());
                boolean z4 = obtainStyledAttributes.getBoolean(a.e.X(), false);
                boolean z5 = true;
                boolean z6 = !obtainStyledAttributes.hasValue(a.e.X()) && obtainStyledAttributes.getBoolean(a.e.Z(), false);
                if (!obtainStyledAttributes.getBoolean(a.e.W(), false) && !z4 && !z6) {
                    z5 = false;
                }
                obtainStyledAttributes.recycle();
                String str = f67928d;
                com.xinzhu.overmind.b.a(str, "ifActivityFloating " + z5);
                return z5;
            }
            throw new RuntimeException("ifActivityFloating get Resources failed");
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean q(ActivityInfo activityInfo) {
        int i4 = activityInfo.screenOrientation;
        return i4 == 0 || i4 == 6 || i4 == 8 || i4 == 11;
    }

    private String x(IBinder iBinder) {
        if (com.xinzhu.overmind.utils.e.f()) {
            return com.xinzhu.haunted.android.app.f.c().c(iBinder);
        }
        return new m(com.xinzhu.haunted.android.app.d.c()).i(iBinder);
    }

    private int y(IBinder iBinder) {
        if (com.xinzhu.overmind.utils.e.f()) {
            return com.xinzhu.haunted.android.app.f.c().d(iBinder);
        }
        return new m(com.xinzhu.haunted.android.app.d.c()).j(iBinder);
    }

    private int z(IInterface iInterface, Intent intent, String str, IBinder iBinder, String str2, int i4, int i5, Bundle bundle) {
        try {
            new m(com.xinzhu.haunted.android.app.d.c()).startActivity(iInterface, Overmind.getHostPkg(), intent, str, iBinder, str2, i4, i5, null, bundle);
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int A(int i4, String str, int i5, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        Objects.requireNonNull(intentArr, "intents is null");
        Objects.requireNonNull(strArr, "resolvedTypes is null");
        if (intentArr.length == strArr.length) {
            for (int i6 = 0; i6 < intentArr.length; i6++) {
                E(i4, str, i5, intentArr[i6], strArr[i6], iBinder, null, -1, 0, bundle, false);
            }
            return 0;
        }
        throw new IllegalArgumentException("intents are length different than resolvedTypes");
    }

    public int B(Intent intent) {
        synchronized (this.f67930b) {
            b bVar = (b) StubActivityRecord.create(intent).mActivityRecord;
            if (bVar == null) {
                return -1;
            }
            if (this.f67931c.contains(bVar)) {
                if (bVar.task != null) {
                    b e5 = e(bVar.userId, bVar.resultTo);
                    if (e5 == null || e5.task != bVar.task) {
                        e5 = bVar.task.b();
                    }
                    return z(e5.processRecord.appThread, intent, null, e5.token, null, -1, 0, null);
                }
                Overmind.getContext().startActivity(intent);
                return 0;
            }
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f8 A[LOOP:3: B:138:0x01f2->B:140:0x01f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020c  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int E(int r22, java.lang.String r23, int r24, android.content.Intent r25, java.lang.String r26, android.os.IBinder r27, java.lang.String r28, int r29, int r30, android.os.Bundle r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.am.c.E(int, java.lang.String, int, android.content.Intent, java.lang.String, android.os.IBinder, java.lang.String, int, int, android.os.Bundle, boolean):int");
    }

    public boolean a(Intent intent, int i4) {
        return (intent.getFlags() & i4) != 0;
    }

    public h g(int i4) {
        synchronized (this.f67930b) {
            for (h hVar : this.f67930b.values()) {
                if (hVar.f67936a == i4) {
                    return hVar;
                }
            }
            return null;
        }
    }

    public ComponentName j(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return null;
            }
            b e6 = e(i4, e5.resultTo);
            if (e6 == null) {
                return null;
            }
            return e6.component;
        }
    }

    public String k(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return null;
            }
            b e6 = e(i4, e5.resultTo);
            if (e6 == null) {
                return null;
            }
            return e6.info.packageName;
        }
    }

    public String l(IBinder iBinder) {
        b f5 = f(iBinder);
        if (f5 != null) {
            return f5.launchedFromPackage;
        }
        return x(iBinder);
    }

    public int m(IBinder iBinder) {
        b f5 = f(iBinder);
        if (f5 != null) {
            return f5.launchedFromUid;
        }
        return y(iBinder);
    }

    b r(Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i4, String str, int i5) {
        b create = b.create(intent, activityInfo, iBinder, i4, str, i5);
        synchronized (this.f67931c) {
            this.f67931c.add(create);
        }
        return create;
    }

    public void s(ProcessRecord processRecord, int i4, IBinder iBinder, b bVar) {
        synchronized (this.f67931c) {
            this.f67931c.remove(bVar);
        }
        synchronized (this.f67930b) {
            G();
            h hVar = this.f67930b.get(Integer.valueOf(i4));
            if (hVar == null) {
                hVar = new h(i4, bVar.userId, s.f(bVar.info));
                hVar.f67939d = bVar.intent;
                this.f67930b.put(Integer.valueOf(i4), hVar);
            }
            bVar.token = iBinder;
            bVar.processRecord = processRecord;
            bVar.task = hVar;
            hVar.a(bVar);
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityCreated : ");
            sb.append(bVar.component.toString());
        }
        c(bVar.userId);
    }

    public void t(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            G();
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return;
            }
            e5.finished = true;
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityDestroyed : ");
            sb.append(e5.component.toString());
            e5.task.d(e5);
        }
    }

    public void u(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            G();
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityResumed : ");
            sb.append(e5.component.toString());
            e5.task.d(e5);
            e5.task.a(e5);
        }
    }

    public void v(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return;
            }
            e5.finished = true;
            StringBuilder sb = new StringBuilder();
            sb.append("onFinishActivity : ");
            sb.append(e5.component.toString());
        }
    }

    public void w(int i4, IBinder iBinder) {
        synchronized (this.f67930b) {
            b e5 = e(i4, iBinder);
            if (e5 == null) {
                return;
            }
            for (b bVar : e5.task.f67940e) {
                bVar.finished = true;
            }
            c(i4);
            StringBuilder sb = new StringBuilder();
            sb.append("onFinishActivityAffinity token : ");
            sb.append(e5.component.toString());
        }
    }
}
