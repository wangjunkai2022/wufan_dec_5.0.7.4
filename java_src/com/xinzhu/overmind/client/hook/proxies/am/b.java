package com.xinzhu.overmind.client.hook.proxies.am;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.LogPrinter;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.xinzhu.haunted.android.app.c;
import com.xinzhu.haunted.android.app.i;
import com.xinzhu.haunted.android.app.m;
import com.xinzhu.haunted.android.app.u;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.proxies.am.d;
import com.xinzhu.overmind.client.stub.record.StubTrampolineRecord;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.entity.PendingIntentRecord;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.user.MindUserHandle;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: ActivityManagerStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67641b = "ActivityManagerStub";

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    class a extends XC_MethodHook {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // de.robv.android.xposed.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            methodHookParam.args[0] = com.xinzhu.overmind.client.hook.env.a.i((Intent) methodHookParam.args[0]);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class a0 extends com.xinzhu.overmind.client.hook.e {
        a0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "stopService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String packageName;
            Intent intent = (Intent) objArr[1];
            String str = (String) objArr[2];
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            if (intent.getComponent() != null && (packageName = intent.getComponent().getPackageName()) != null && com.xinzhu.overmind.client.hook.env.a.f(packageName)) {
                return method.invoke(obj, objArr);
            }
            Intent stopService = Overmind.getMindActivityManager().stopService(intent, str, com.xinzhu.overmind.client.e.getUserId());
            if (stopService != null) {
                com.xinzhu.overmind.b.c(b.f67641b, "stopService called " + stopService);
                stopService.putExtra("operation", "stop_service");
                Overmind.getContext().startService(stopService);
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.am.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0725b extends com.xinzhu.overmind.client.hook.e {
        C0725b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addPackageDependency";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class b0 extends com.xinzhu.overmind.client.hook.e {
        b0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "stopServiceToken";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String packageName;
            ComponentName componentName = (ComponentName) objArr[0];
            if (componentName != null && (packageName = componentName.getPackageName()) != null && com.xinzhu.overmind.client.hook.env.a.f(packageName)) {
                return method.invoke(obj, objArr);
            }
            Intent intent = new Intent();
            intent.setPackage(componentName.getPackageName());
            intent.setClassName(componentName.getPackageName(), componentName.getClassName());
            Intent stopService = Overmind.getMindActivityManager().stopService(intent, "", com.xinzhu.overmind.client.e.getUserId());
            if (stopService != null) {
                com.xinzhu.overmind.b.c(b.f67641b, "stopService called " + stopService);
                stopService.putExtra("operation", "stop_service");
                Overmind.getContext().startService(stopService);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class c extends d {
        c() {
        }

        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.d, com.xinzhu.overmind.client.hook.e
        protected String c() {
            return "bindIsolatedService";
        }

        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.d
        protected boolean f() {
            return true;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class c0 extends com.xinzhu.overmind.client.hook.e {
        c0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "unbindService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[0];
            if (iServiceConnection == null) {
                return method.invoke(obj, objArr);
            }
            Overmind.getMindActivityManager().unbindService(iServiceConnection.asBinder(), com.xinzhu.overmind.client.e.getUserId());
            com.xinzhu.overmind.client.hook.delegate.c delegate = com.xinzhu.overmind.client.hook.delegate.c.getDelegate(iServiceConnection.asBinder());
            if (delegate != null) {
                objArr[0] = delegate;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "bindService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            Intent intent = (Intent) objArr[2];
            String str = (String) objArr[3];
            int a5 = com.xinzhu.overmind.utils.r.a(objArr[5]);
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[4];
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            com.xinzhu.overmind.utils.helpers.c.e(objArr);
            ResolveInfo C = Overmind.getMindPackageManager().C(intent, 0, str, com.xinzhu.overmind.client.e.getUserId());
            if (C != null) {
                if (f()) {
                    objArr[6] = null;
                }
                Intent bindService = Overmind.getMindActivityManager().bindService(intent, iServiceConnection != null ? iServiceConnection.asBinder() : null, str, com.xinzhu.overmind.client.e.getUserId(), a5);
                if (iServiceConnection != null) {
                    ServiceInfo serviceInfo = C.serviceInfo;
                    objArr[4] = com.xinzhu.overmind.client.hook.delegate.c.createProxy(iServiceConnection, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                }
                if (bindService != null) {
                    objArr[2] = bindService;
                    return method.invoke(obj, objArr);
                }
            }
            if (com.xinzhu.overmind.client.hook.env.a.e(intent.getComponent())) {
                return method.invoke(obj, objArr);
            }
            com.xinzhu.overmind.b.c(b.f67641b, "bindService failed and skip " + intent);
            return 0;
        }

        protected boolean f() {
            return false;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class e extends c {
        e() {
        }

        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.c, com.xinzhu.overmind.client.hook.proxies.am.b.d, com.xinzhu.overmind.client.hook.e
        protected String c() {
            return "bindServiceInstance";
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "broadcastIntent";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int f5 = f(objArr);
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            Intent k4 = com.xinzhu.overmind.client.hook.env.a.k(Overmind.getMindActivityManager().w((Intent) objArr[f5], (String) objArr[f5 + 1], com.xinzhu.overmind.client.e.getUserId()));
            if (k4 != null) {
                objArr[f5] = k4;
            }
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] instanceof String[]) {
                    objArr[i4] = null;
                }
            }
            return method.invoke(obj, objArr);
        }

        int f(Object[] objArr) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] instanceof Intent) {
                    return i4;
                }
            }
            return 1;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class g extends f {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.f, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "broadcastIntentWithFeature";
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class h extends com.xinzhu.overmind.client.hook.e {
        h() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "checkPermission";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PermissionInfo[] permissionInfoArr;
            String[] strArr;
            String str = (String) objArr[0];
            if (com.xinzhu.overmind.client.hook.env.a.b(str)) {
                return 0;
            }
            PackageInfo l4 = Overmind.getMindPackageManager().l(com.xinzhu.overmind.client.e.getVPackageName(), 4096, com.xinzhu.overmind.client.e.getUserId());
            if (l4 != null && (permissionInfoArr = l4.permissions) != null) {
                for (PermissionInfo permissionInfo : permissionInfoArr) {
                    if (str.equals(permissionInfo.name) && (strArr = l4.requestedPermissions) != null && Arrays.asList(strArr).contains(str)) {
                        return 0;
                    }
                }
            }
            objArr[2] = Integer.valueOf(Overmind.getHostUid());
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class i extends h {
        i() {
        }

        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.h, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "checkPermissionWithToken";
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class j extends com.xinzhu.overmind.client.hook.e {
        j() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "checkUriPermission";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if ((objArr[0] instanceof Uri) && objArr[0].toString().equals("content://telephony/carriers/preferapn")) {
                int i4 = Overmind.get().hostCheckPermission("Manifest.permission.WRITE_APN_SETTINGS", com.xinzhu.overmind.client.e.getClientConfig().f67770j) ? 0 : -1;
                com.xinzhu.overmind.b.a(b.f67641b, "check preferapn perm " + i4);
                return Integer.valueOf(i4);
            }
            return 0;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class k extends com.xinzhu.overmind.client.hook.e {
        k() {
        }

        private int f() {
            return com.xinzhu.overmind.utils.e.f() ? 2 : 1;
        }

        private int g() {
            return f() + 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getContentProvider";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Exception {
            Object i4;
            IBinder iBinder;
            int f5 = f();
            Object obj2 = objArr[f5];
            e(objArr, g());
            if (obj2 instanceof String) {
                String str = ((String) obj2).split(";")[0];
                objArr[f5] = str;
                if (com.xinzhu.overmind.client.f.n(str)) {
                    return method.invoke(obj, objArr);
                }
                if (com.xinzhu.overmind.utils.e.f()) {
                    objArr[1] = Overmind.getHostPkg();
                }
                if (!str.equals("settings") && !str.equals("media") && !str.equals("telephony") && !str.equals("downloads")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("hook getContentProvider: ");
                    sb.append(str);
                    ProviderInfo A = Overmind.getMindPackageManager().A(str, 128, com.xinzhu.overmind.client.e.getUserId());
                    if (A != null && Overmind.get().isInstalled(A.packageName)) {
                        if (com.xinzhu.overmind.client.e.getVPid() != -1) {
                            ClientConfig k4 = Overmind.getMindActivityManager().k(A.packageName, A.processName, com.xinzhu.overmind.client.e.getUserId());
                            iBinder = k4.f67764d != com.xinzhu.overmind.client.e.getVPid() ? Overmind.getMindActivityManager().a(A) : null;
                            objArr[f5] = k4.f67770j ? com.xinzhu.overmind.client.f.c(k4.f67764d) : com.xinzhu.overmind.client.f.g(k4.f67764d);
                            objArr[g()] = Integer.valueOf(MindUserHandle.k(Overmind.getHostUid()));
                        } else {
                            iBinder = null;
                        }
                        Object invoke = method.invoke(obj, objArr);
                        if (invoke == null) {
                            return null;
                        }
                        com.xinzhu.overmind.utils.t.t(invoke).f(PapayPayDetialActivity_.f36841l).q(A);
                        if (iBinder != null) {
                            com.xinzhu.overmind.utils.t.t(invoke).f(com.umeng.analytics.pro.f.M).q(new com.xinzhu.overmind.client.hook.proxies.context.providers.a().b((IInterface) com.xinzhu.haunted.android.content.g.a(iBinder), Overmind.getHostPkg()));
                        }
                        return invoke;
                    }
                    try {
                        Object invoke2 = method.invoke(obj, objArr);
                        if (invoke2 != null && (i4 = com.xinzhu.overmind.utils.t.t(invoke2).f(com.umeng.analytics.pro.f.M).i()) != null && !(i4 instanceof Proxy)) {
                            com.xinzhu.overmind.utils.t.t(invoke2).f(com.umeng.analytics.pro.f.M).q(new com.xinzhu.overmind.client.hook.proxies.context.providers.a().b((IInterface) i4, Overmind.getHostPkg()));
                        }
                        return invoke2;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                }
                Object invoke3 = method.invoke(obj, objArr);
                com.xinzhu.overmind.client.hook.delegate.b.update(invoke3, str);
                return invoke3;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class l extends com.xinzhu.overmind.client.hook.e {
        l() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getCurrentUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                com.xinzhu.haunted.android.content.pm.p c5 = com.xinzhu.haunted.android.content.pm.p.c(com.xinzhu.overmind.client.e.getUserId(), "Admin", com.xinzhu.haunted.android.content.pm.p.d());
                Objects.requireNonNull(c5);
                return c5.f66594a;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class m extends com.xinzhu.overmind.client.hook.e {
        m() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getInfoForIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PendingIntentRecord b5;
            IInterface iInterface = (IInterface) objArr[0];
            if (iInterface != null && (b5 = com.xinzhu.overmind.client.frameworks.a.d().b(iInterface.asBinder())) != null) {
                c.a f5 = c.a.f(b5.f67774b, b5.f67775c, (b5.f67779g & TTAdConstant.KEY_CLICK_AREA) != 0, b5.f67780h);
                if (f5 != null) {
                    return f5.f65786a;
                }
            }
            Object invoke = method.invoke(obj, objArr);
            c.a aVar = new c.a(invoke);
            com.xinzhu.overmind.b.c(b.f67641b, "<Bug likely> getInfoForIntentSender fallback to system, CreatorPackage: " + aVar.g() + " " + iInterface);
            return invoke;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class n extends com.xinzhu.overmind.client.hook.e {
        n() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIntentForIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Intent intent = (Intent) method.invoke(obj, objArr);
            if (intent != null) {
                return StubTrampolineRecord.create(intent).mTarget;
            }
            return null;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class o extends com.xinzhu.overmind.client.hook.e {
        o() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackageForIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PendingIntentRecord b5;
            IInterface iInterface = (IInterface) objArr[0];
            if (iInterface != null && (b5 = com.xinzhu.overmind.client.frameworks.a.d().b(iInterface.asBinder())) != null) {
                return b5.f67774b;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class p extends com.xinzhu.overmind.client.hook.e {
        p() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getRunningAppProcesses";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            List list = (List) method.invoke(obj, objArr);
            if (list == null || com.xinzhu.overmind.client.e.getClientConfig() == null) {
                return null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
                if (runningAppProcessInfo.uid == Overmind.getHostUid()) {
                    ProcessRecord c5 = com.xinzhu.overmind.client.frameworks.a.d().c(runningAppProcessInfo.pid);
                    if (c5 == null) {
                        if (runningAppProcessInfo.processName.startsWith(Overmind.getMainPkg()) || runningAppProcessInfo.processName.startsWith(Overmind.getPluginPkg())) {
                            it2.remove();
                        }
                    } else if (c5.userId != com.xinzhu.overmind.client.e.getUserId()) {
                        it2.remove();
                    } else {
                        runningAppProcessInfo.uid = c5.vuid;
                        String str = c5.processName;
                        if (str != null) {
                            runningAppProcessInfo.importanceReasonCode = 0;
                            runningAppProcessInfo.importanceReasonPid = 0;
                            runningAppProcessInfo.importanceReasonComponent = null;
                            runningAppProcessInfo.processName = str;
                        }
                    }
                }
            }
            return list;
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class q extends com.xinzhu.overmind.client.hook.e {
        q() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getUidForIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PendingIntentRecord b5;
            IInterface iInterface = (IInterface) objArr[0];
            if (iInterface != null && (b5 = com.xinzhu.overmind.client.frameworks.a.d().b(iInterface.asBinder())) != null) {
                return Integer.valueOf(b5.f67775c);
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class r extends com.xinzhu.overmind.client.hook.e {
        r() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "grantUriPermission";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class s extends com.xinzhu.overmind.client.hook.e {
        s() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "handleApplicationWtf";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getStackTraceElement();
            new i.a(objArr[3]).b(new LogPrinter(2, b.f67641b), "");
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class t extends com.xinzhu.overmind.client.hook.e {
        t() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "handleIncomingUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            objArr[1] = Integer.valueOf(Overmind.getHostUid());
            objArr[2] = Integer.valueOf(Overmind.getHostUserId());
            if (objArr[objArr.length - 1] instanceof String) {
                objArr[objArr.length - 1] = Overmind.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class u extends com.xinzhu.overmind.client.hook.e {
        u() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "peekService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.e(objArr);
            return Overmind.getMindActivityManager().t((Intent) objArr[0], (String) objArr[1], com.xinzhu.overmind.client.e.getUserId());
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class v extends com.xinzhu.overmind.client.hook.e {
        v() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "publishService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class w extends com.xinzhu.overmind.client.hook.e {

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<IBinder, IIntentReceiver> f67643a = new WeakHashMap<>();

        /* compiled from: ActivityManagerStub.java */
        /* loaded from: classes.dex */
        class a implements IBinder.DeathRecipient {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IBinder f67644b;

            a(IBinder iBinder) {
                this.f67644b = iBinder;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                this.f67644b.unlinkToDeath(this, 0);
                w.this.f67643a.remove(this.f67644b);
            }
        }

        /* compiled from: ActivityManagerStub.java */
        /* renamed from: com.xinzhu.overmind.client.hook.proxies.am.b$w$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class BinderC0726b extends IIntentReceiver.Stub {
            IntentFilter mFilter;
            IInterface mOrigin;

            BinderC0726b(IInterface iInterface, IntentFilter intentFilter) {
                this.mOrigin = iInterface;
                this.mFilter = intentFilter;
            }

            @Override // android.content.IIntentReceiver
            public void performReceive(Intent intent, int i4, String str, Bundle bundle, boolean z4, boolean z5, int i5) {
                new com.xinzhu.haunted.android.content.k(this.mOrigin).b(com.xinzhu.overmind.client.hook.env.a.i(intent), i4, str, bundle, z4, z5, i5);
            }
        }

        w() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "registerReceiver";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, IntentFilter.class);
            int i4 = a5 - 1;
            int i5 = a5 + 1;
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            objArr[i5] = null;
            e(objArr, i5 + 1);
            IntentFilter intentFilter = (IntentFilter) objArr[a5];
            com.xinzhu.overmind.client.hook.env.a.l(intentFilter);
            objArr[a5] = intentFilter;
            IInterface iInterface = (IInterface) objArr[i4];
            if (iInterface != null && !(iInterface instanceof BinderC0726b) && !com.xinzhu.overmind.utils.e.k()) {
                IBinder asBinder = iInterface.asBinder();
                asBinder.linkToDeath(new a(asBinder), 0);
                IIntentReceiver iIntentReceiver = this.f67643a.get(asBinder);
                if (iIntentReceiver == null) {
                    iIntentReceiver = new BinderC0726b(iInterface, intentFilter);
                    this.f67643a.put(asBinder, iIntentReceiver);
                }
                WeakReference weakReference = (WeakReference) new u.a.b(iInterface).b();
                if (weakReference != null) {
                    new u.a(weakReference.get()).c(iIntentReceiver);
                    objArr[i4] = iIntentReceiver;
                }
            }
            return com.xinzhu.overmind.client.hook.env.a.i((Intent) method.invoke(obj, objArr));
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class x extends w {
        x() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.b.w, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "registerReceiverWithFeature";
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class y extends com.xinzhu.overmind.client.hook.e {
        y() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "sendIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ActivityManagerStub.java */
    /* loaded from: classes.dex */
    static class z extends com.xinzhu.overmind.client.hook.e {
        z() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Intent intent = (Intent) objArr[1];
            if (intent == null) {
                return null;
            }
            if (intent.getComponent() != null && Overmind.isOvermindPkg(intent.getComponent().getPackageName())) {
                return method.invoke(obj, objArr);
            }
            String str = (String) objArr[2];
            if (com.xinzhu.overmind.utils.e.w() && (objArr[3] instanceof Boolean) && ((Boolean) objArr[3]).booleanValue()) {
                objArr[3] = Boolean.FALSE;
            }
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ResolveInfo C = Overmind.getMindPackageManager().C(intent, 0, str, com.xinzhu.overmind.client.e.getUserId());
            if (C == null) {
                if (com.xinzhu.overmind.client.hook.env.a.e(intent.getComponent())) {
                    return method.invoke(obj, objArr);
                }
                com.xinzhu.overmind.b.c(b.f67641b, "startService failed and skip " + intent);
                return null;
            }
            try {
                Intent startService = Overmind.getMindActivityManager().startService(intent, str, com.xinzhu.overmind.client.e.getUserId(), 0);
                startService.putExtra("operation", "start_service");
                objArr[1] = startService;
                if (((ComponentName) method.invoke(obj, objArr)) != null) {
                    ServiceInfo serviceInfo = C.serviceInfo;
                    return new ComponentName(serviceInfo.packageName, serviceInfo.name);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r1 = this;
            android.os.IInterface r0 = com.xinzhu.haunted.android.app.d.c()
            java.util.Objects.requireNonNull(r0)
            android.os.IInterface r0 = (android.os.IInterface) r0
            android.os.IBinder r0 = r0.asBinder()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.client.hook.proxies.am.b.<init>():void");
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return com.xinzhu.haunted.android.app.d.c() != getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        IInterface c5 = com.xinzhu.haunted.android.app.d.c();
        Objects.requireNonNull(c5);
        return m.b.a(c5.asBinder());
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        Object d5;
        if (com.xinzhu.overmind.utils.e.w()) {
            d5 = com.xinzhu.haunted.android.app.e.d();
        } else {
            d5 = com.xinzhu.overmind.utils.e.a() ? com.xinzhu.haunted.android.app.d.d() : null;
        }
        new com.xinzhu.haunted.android.util.b(d5).e(obj2);
        replaceSystemService(TTDownloadField.TT_ACTIVITY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        addMethodHook(new k());
        addMethodHook(new z());
        addMethodHook(new a0());
        addMethodHook(new b0());
        addMethodHook(new d());
        addMethodHook(new c());
        addMethodHook(new c0());
        addMethodHook(new p());
        addMethodHook(new o());
        addMethodHook(new q());
        addMethodHook(new n());
        addMethodHook(new v());
        addMethodHook(new u());
        addMethodHook(new y());
        addMethodHook(new f());
        addMethodHook(new g());
        addMethodHook(new w());
        addMethodHook(new x());
        if (com.xinzhu.overmind.utils.e.k()) {
            Class<?> cls = u.a.f66141b;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            XposedHelpers.findAndHookMethod(cls, "performReceive", Intent.class, cls2, String.class, Bundle.class, cls3, cls3, cls3, cls2, cls2, String.class, new a());
        }
        addMethodHook(new r());
        addMethodHook(new j());
        addMethodHook(new h());
        addMethodHook(new i());
        addMethodHook(new t());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setServiceForeground", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getPackageProcessState", 4));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getHistoricalProcessExitReasons", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67576e));
        addMethodHook(new d.o());
        addMethodHook(new d.n());
        addMethodHook(new d.a());
        addMethodHook(new d.b());
        addMethodHook(new d.c());
        addMethodHook(new d.C0727d());
        addMethodHook(new d.f());
        addMethodHook(new d.g());
        addMethodHook(new d.s());
        addMethodHook(new d.p());
        addMethodHook(new d.r());
        addMethodHook(new d.t());
        addMethodHook(new d.q());
        addMethodHook(new d.l());
        addMethodHook(new d.e());
        addMethodHook(new d.k());
        addMethodHook(new d.h());
        addMethodHook(new d.i());
        addMethodHook(new d.j());
        addMethodHook(new d.m());
        addMethodHook(new l());
        addMethodHook(new C0725b());
        addMethodHook(new s());
        if (com.xinzhu.overmind.utils.e.h()) {
            addMethodHook(new m());
            addMethodHook(new e());
        }
        if (com.xinzhu.overmind.utils.e.g()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getHistoricalProcessExitReasons", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67578g));
        }
    }
}
