package com.xinzhu.overmind.client.hook.proxies.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IInterface;
import android.os.Process;
import com.xinzhu.haunted.android.content.pm.h;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: PackageManagerStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67711b = "PackageManagerStub";

    /* renamed from: c  reason: collision with root package name */
    private static final int f67712c = 4194304;

    /* renamed from: d  reason: collision with root package name */
    private static final int f67713d = 2097152;

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.common.d {
        a(String str, int i4, int i5) {
            super(str, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.common.d, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PermissionInfo[] permissionInfoArr;
            String[] strArr;
            String str = (String) objArr[0];
            PackageInfo l4 = Overmind.getMindPackageManager().l(com.xinzhu.overmind.client.e.getVPackageName(), 4096, com.xinzhu.overmind.client.e.getUserId());
            if (l4 != null && (permissionInfoArr = l4.permissions) != null) {
                for (PermissionInfo permissionInfo : permissionInfoArr) {
                    if (str.equals(permissionInfo.name) && (strArr = l4.requestedPermissions) != null && Arrays.asList(strArr).contains(str)) {
                        return 0;
                    }
                }
            }
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class a0 extends com.xinzhu.overmind.client.hook.e {
        a0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setApplicationEnabledSetting";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return 0;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class b extends com.xinzhu.overmind.client.hook.e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "canRequestPackageInstalls";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class b0 extends com.xinzhu.overmind.client.hook.e {
        b0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setComponentEnabledSetting";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            com.xinzhu.overmind.client.frameworks.g.d().p().setComponentEnabledSetting((ComponentName) objArr[0], intValue, intValue2, com.xinzhu.overmind.client.e.getUserId());
            return 0;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.pm.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0739c extends com.xinzhu.overmind.client.hook.e {
        C0739c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "freeStorage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            IntentSender intentSender = (IntentSender) objArr[com.xinzhu.overmind.utils.d.h(objArr, IntentSender.class)];
            if (intentSender != null) {
                intentSender.sendIntent(Overmind.getContext(), 0, null, null, null);
                return null;
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "freeStorageAndNotify";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            IPackageDataObserver iPackageDataObserver = (IPackageDataObserver) objArr[objArr.length - 1];
            if (iPackageDataObserver != null) {
                iPackageDataObserver.onRemoveCompleted(com.xinzhu.overmind.client.e.getVPackageName(), true);
                return null;
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class e extends com.xinzhu.overmind.client.hook.e {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getActivityInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo e5 = Overmind.getMindPackageManager().e(componentName, com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId());
            if (e5 != null) {
                return e5;
            }
            if (com.xinzhu.overmind.client.hook.env.a.e(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getApplicationEnabledSetting";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            if (Overmind.get().isInstalled(str)) {
                return 1;
            }
            if (com.xinzhu.overmind.client.hook.env.a.f(str)) {
                com.xinzhu.overmind.utils.helpers.c.f(objArr);
                return method.invoke(obj, objArr);
            }
            return 2;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class g extends com.xinzhu.overmind.client.hook.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getApplicationInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            String str = (String) objArr[0];
            ApplicationInfo b5 = com.xinzhu.overmind.server.pm.j.b(Overmind.getMindPackageManager().f(str, com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId()));
            if (b5 != null) {
                return b5;
            }
            if (com.xinzhu.overmind.client.hook.env.a.f(str)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class h extends com.xinzhu.overmind.client.hook.e {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getComponentEnabledSetting";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Integer.valueOf(com.xinzhu.overmind.client.frameworks.g.d().p().getComponentEnabledSetting((ComponentName) objArr[0], com.xinzhu.overmind.client.e.getUserId()));
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class i extends com.xinzhu.overmind.client.hook.e {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getInstalledApplications";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            List<ApplicationInfo> g4 = Overmind.getMindPackageManager().g(com.xinzhu.overmind.utils.r.a(objArr[0]), com.xinzhu.overmind.client.e.getUserId());
            List<?> f5 = new com.xinzhu.haunted.android.content.pm.k(method.invoke(obj, objArr)).f();
            if (f5 != null && !f5.isEmpty()) {
                Iterator<?> it2 = f5.iterator();
                while (it2.hasNext()) {
                    ApplicationInfo applicationInfo = (ApplicationInfo) it2.next();
                    if (!Overmind.get().isInstalled(applicationInfo.packageName) && ((applicationInfo.flags & 9) != 0 || com.xinzhu.overmind.client.hook.env.a.f(applicationInfo.packageName))) {
                        if (!com.xinzhu.overmind.client.hook.env.a.d(applicationInfo.packageName)) {
                            g4.add(applicationInfo);
                        }
                    }
                }
            }
            return com.xinzhu.overmind.utils.helpers.h.a(g4);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class j extends com.xinzhu.overmind.client.hook.e {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getInstalledPackages";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            List<PackageInfo> h4 = Overmind.getMindPackageManager().h(com.xinzhu.overmind.utils.r.a(objArr[0]), com.xinzhu.overmind.client.e.getUserId());
            List<?> f5 = new com.xinzhu.haunted.android.content.pm.k(method.invoke(obj, objArr)).f();
            if (f5 != null && !f5.isEmpty()) {
                Iterator<?> it2 = f5.iterator();
                while (it2.hasNext()) {
                    PackageInfo packageInfo = (PackageInfo) it2.next();
                    if (!Overmind.get().isInstalled(packageInfo.packageName) && ((packageInfo.applicationInfo.flags & 9) != 0 || com.xinzhu.overmind.client.hook.env.a.f(packageInfo.packageName))) {
                        if (!com.xinzhu.overmind.client.hook.env.a.d(packageInfo.packageName)) {
                            h4.add(packageInfo);
                        }
                    }
                }
            }
            return com.xinzhu.overmind.utils.helpers.h.a(h4);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class k extends com.xinzhu.overmind.client.hook.e {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackageInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            String str = (String) objArr[0];
            int a5 = com.xinzhu.overmind.utils.r.a(objArr[1]);
            if ((4194304 & a5) != 0) {
                a5 &= -4194305;
                objArr[1] = Integer.valueOf(a5);
            }
            if ((2097152 & a5) != 0) {
                return method.invoke(obj, objArr);
            }
            PackageInfo d5 = com.xinzhu.overmind.server.pm.j.d(Overmind.getMindPackageManager().l(str, a5, com.xinzhu.overmind.client.e.getUserId()));
            if (d5 != null) {
                return d5;
            }
            if (com.xinzhu.overmind.client.hook.env.a.f(str)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class l extends com.xinzhu.overmind.client.hook.e {

        /* compiled from: PackageManagerStub.java */
        /* loaded from: classes.dex */
        class a implements InvocationHandler {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IInterface f67715b;

            a(IInterface iInterface) {
                this.f67715b = iInterface;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                name.hashCode();
                char c5 = 65535;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            c5 = 0;
                            break;
                        }
                        break;
                    case -1663319615:
                        if (name.equals("bypassNextStagedInstallerCheck")) {
                            c5 = 1;
                            break;
                        }
                        break;
                    case -1273119136:
                        if (name.equals("getSession")) {
                            c5 = 2;
                            break;
                        }
                        break;
                    case -663066834:
                        if (name.equals("getSessionInfo")) {
                            c5 = 3;
                            break;
                        }
                        break;
                    case -652885011:
                        if (name.equals("updateSessionAppIcon")) {
                            c5 = 4;
                            break;
                        }
                        break;
                    case -625596190:
                        if (name.equals("uninstall")) {
                            c5 = 5;
                            break;
                        }
                        break;
                    case -403218424:
                        if (name.equals("registerCallback")) {
                            c5 = 6;
                            break;
                        }
                        break;
                    case -298116903:
                        if (name.equals("getStagedSessions")) {
                            c5 = 7;
                            break;
                        }
                        break;
                    case -93516191:
                        if (name.equals("abandonSession")) {
                            c5 = '\b';
                            break;
                        }
                        break;
                    case -63461894:
                        if (name.equals("createSession")) {
                            c5 = '\t';
                            break;
                        }
                        break;
                    case 938656808:
                        if (name.equals("getAllSessions")) {
                            c5 = '\n';
                            break;
                        }
                        break;
                    case 1081646368:
                        if (name.equals("installExistingPackage")) {
                            c5 = 11;
                            break;
                        }
                        break;
                    case 1170196863:
                        if (name.equals("setPermissionsResult")) {
                            c5 = '\f';
                            break;
                        }
                        break;
                    case 1238099456:
                        if (name.equals("updateSessionAppLabel")) {
                            c5 = '\r';
                            break;
                        }
                        break;
                    case 1316930297:
                        if (name.equals("uninstallExistingPackage")) {
                            c5 = 14;
                            break;
                        }
                        break;
                    case 1568181855:
                        if (name.equals("getMySessions")) {
                            c5 = 15;
                            break;
                        }
                        break;
                    case 1738611873:
                        if (name.equals("unregisterCallback")) {
                            c5 = 16;
                            break;
                        }
                        break;
                    case 1788161260:
                        if (name.equals("openSession")) {
                            c5 = 17;
                            break;
                        }
                        break;
                }
                switch (c5) {
                    case 0:
                        return "PackageInstaller";
                    case 1:
                    case 16:
                        com.xinzhu.overmind.utils.helpers.c.d(objArr);
                        return method.invoke(this.f67715b, objArr);
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                    case '\b':
                    case 11:
                    case '\f':
                    case '\r':
                    case 17:
                        return method.invoke(this.f67715b, objArr);
                    case 5:
                    case 14:
                    case 15:
                        com.xinzhu.overmind.utils.helpers.c.d(objArr);
                        com.xinzhu.overmind.utils.helpers.c.f(objArr);
                        return method.invoke(this.f67715b, objArr);
                    case 6:
                    case '\n':
                        com.xinzhu.overmind.utils.helpers.c.f(objArr);
                        return method.invoke(this.f67715b, objArr);
                    case '\t':
                        new h.a((PackageInstaller.SessionParams) objArr[0]).c(Overmind.getHostPkg());
                        com.xinzhu.overmind.utils.helpers.c.d(objArr);
                        com.xinzhu.overmind.utils.helpers.c.f(objArr);
                        return method.invoke(this.f67715b, objArr);
                    default:
                        throw new RuntimeException("Unknown package installer interface " + method.getName());
                }
            }
        }

        l() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackageInstaller";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            if (iInterface == null) {
                return null;
            }
            return (IInterface) Proxy.newProxyInstance(iInterface.getClass().getClassLoader(), iInterface.getClass().getInterfaces(), new a(iInterface));
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class m extends com.xinzhu.overmind.client.hook.e {
        m() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackageUid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            int intValue = ((Integer) method.invoke(obj, objArr)).intValue();
            if (intValue == Overmind.getHostUid()) {
                return Integer.valueOf(com.xinzhu.overmind.client.e.getVUid());
            }
            return Integer.valueOf(intValue);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class n extends com.xinzhu.overmind.client.hook.e {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackagesForUid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == 1000) {
                return method.invoke(obj, objArr);
            }
            if (intValue == Overmind.getHostUid()) {
                intValue = com.xinzhu.overmind.client.e.getVUid();
            }
            String[] m4 = com.xinzhu.overmind.client.frameworks.g.d().m(intValue);
            com.xinzhu.overmind.b.c(c.f67711b, "getPackagesForUid result " + intValue + " " + Arrays.toString(m4));
            return m4;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class o extends com.xinzhu.overmind.client.hook.e {
        o() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getProviderInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ComponentName componentName = (ComponentName) objArr[0];
            ProviderInfo n4 = Overmind.getMindPackageManager().n(componentName, com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId());
            if (n4 != null) {
                return n4;
            }
            if (com.xinzhu.overmind.client.hook.env.a.e(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class p extends com.xinzhu.overmind.client.hook.e {
        p() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getReceiverInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo o4 = Overmind.getMindPackageManager().o(componentName, com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId());
            if (o4 != null) {
                return o4;
            }
            if (com.xinzhu.overmind.client.hook.env.a.e(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class q extends com.xinzhu.overmind.client.hook.e {
        q() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getServiceInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ComponentName componentName = (ComponentName) objArr[0];
            ServiceInfo q4 = Overmind.getMindPackageManager().q(componentName, com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId());
            if (q4 != null) {
                return q4;
            }
            if (com.xinzhu.overmind.client.hook.env.a.e(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class r extends com.xinzhu.overmind.client.hook.e {
        r() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getSharedLibraries";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            int a5 = com.xinzhu.overmind.utils.r.a(objArr[1]);
            if ((4194304 & a5) != 0) {
                objArr[1] = Integer.valueOf(a5 & (-4194305));
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class s extends com.xinzhu.overmind.client.hook.e {
        s() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "queryContentProviders";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            objArr[1] = Integer.valueOf(com.xinzhu.overmind.client.e.getUid());
            return com.xinzhu.overmind.utils.helpers.h.a(Overmind.getMindPackageManager().u(com.xinzhu.overmind.client.e.getVProcessName(), Process.myUid(), com.xinzhu.overmind.utils.r.a(objArr[2]), com.xinzhu.overmind.client.e.getUserId()));
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class t extends com.xinzhu.overmind.client.hook.e {
        t() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "queryIntentActivities";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ArrayList arrayList = new ArrayList();
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    Method declaredMethod = invoke.getClass().getDeclaredMethod("getList", new Class[0]);
                    declaredMethod.setAccessible(true);
                    List<ResolveInfo> list = (List) declaredMethod.invoke(invoke, new Object[0]);
                    if (list != null) {
                        for (ResolveInfo resolveInfo : list) {
                            if (com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.activityInfo.packageName)) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                }
                int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
                int intValue = ((Integer) objArr[3]).intValue();
                List<ResolveInfo> v2 = com.xinzhu.overmind.client.frameworks.g.d().v((Intent) objArr[0], a5, (String) objArr[1], intValue);
                if (v2 != null) {
                    arrayList.addAll(v2);
                }
                com.xinzhu.haunted.android.content.pm.k d5 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d5);
                return d5.f66543a;
            } catch (Throwable th) {
                th.printStackTrace();
                com.xinzhu.haunted.android.content.pm.k d6 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d6);
                return d6.f66543a;
            }
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class u extends com.xinzhu.overmind.client.hook.e {
        u() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "queryIntentContentProviders";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ArrayList arrayList = new ArrayList();
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    Method declaredMethod = invoke.getClass().getDeclaredMethod("getList", new Class[0]);
                    declaredMethod.setAccessible(true);
                    List<ResolveInfo> list = (List) declaredMethod.invoke(invoke, new Object[0]);
                    if (list != null) {
                        for (ResolveInfo resolveInfo : list) {
                            if (com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.providerInfo.packageName)) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                }
                int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
                int intValue = ((Integer) objArr[3]).intValue();
                List<ResolveInfo> x4 = com.xinzhu.overmind.client.frameworks.g.d().x((Intent) objArr[0], a5, (String) objArr[1], intValue);
                if (x4 != null) {
                    arrayList.addAll(x4);
                }
                com.xinzhu.haunted.android.content.pm.k d5 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d5);
                return d5.f66543a;
            } catch (Throwable th) {
                th.printStackTrace();
                com.xinzhu.haunted.android.content.pm.k d6 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d6);
                return d6.f66543a;
            }
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class v extends com.xinzhu.overmind.client.hook.e {
        v() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "queryIntentReceivers";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ArrayList arrayList = new ArrayList();
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    Method declaredMethod = invoke.getClass().getDeclaredMethod("getList", new Class[0]);
                    declaredMethod.setAccessible(true);
                    List<ResolveInfo> list = (List) declaredMethod.invoke(invoke, new Object[0]);
                    if (list != null) {
                        for (ResolveInfo resolveInfo : list) {
                            if (com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.activityInfo.packageName)) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                }
                int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
                int intValue = ((Integer) objArr[3]).intValue();
                List<ResolveInfo> w4 = com.xinzhu.overmind.client.frameworks.g.d().w((Intent) objArr[0], a5, (String) objArr[1], intValue);
                if (w4 != null) {
                    arrayList.addAll(w4);
                }
                com.xinzhu.haunted.android.content.pm.k d5 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d5);
                return d5.f66543a;
            } catch (Throwable th) {
                th.printStackTrace();
                com.xinzhu.haunted.android.content.pm.k d6 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d6);
                return d6.f66543a;
            }
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class w extends com.xinzhu.overmind.client.hook.e {
        w() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "queryIntentServices";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ArrayList arrayList = new ArrayList();
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    Method declaredMethod = invoke.getClass().getDeclaredMethod("getList", new Class[0]);
                    declaredMethod.setAccessible(true);
                    List<ResolveInfo> list = (List) declaredMethod.invoke(invoke, new Object[0]);
                    if (list != null) {
                        for (ResolveInfo resolveInfo : list) {
                            if (com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.serviceInfo.packageName)) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                }
                int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
                int intValue = ((Integer) objArr[3]).intValue();
                List<ResolveInfo> y2 = com.xinzhu.overmind.client.frameworks.g.d().y((Intent) objArr[0], a5, (String) objArr[1], intValue);
                if (y2 != null) {
                    arrayList.addAll(y2);
                }
                com.xinzhu.haunted.android.content.pm.k d5 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d5);
                return d5.f66543a;
            } catch (Throwable th) {
                th.printStackTrace();
                com.xinzhu.haunted.android.content.pm.k d6 = com.xinzhu.haunted.android.content.pm.k.d(arrayList);
                Objects.requireNonNull(d6);
                return d6.f66543a;
            }
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class x extends com.xinzhu.overmind.client.hook.e {
        x() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "resolveContentProvider";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            ProviderInfo A = Overmind.getMindPackageManager().A((String) objArr[0], com.xinzhu.overmind.utils.r.a(objArr[1]), com.xinzhu.overmind.client.e.getUserId());
            return A == null ? method.invoke(obj, objArr) : A;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class y extends com.xinzhu.overmind.client.hook.e {
        y() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "resolveIntent";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
            ResolveInfo B = Overmind.getMindPackageManager().B((Intent) objArr[0], (String) objArr[1], a5, com.xinzhu.overmind.client.e.getUserId());
            if (B != null) {
                return B;
            }
            ResolveInfo resolveInfo = (ResolveInfo) method.invoke(obj, objArr);
            if (resolveInfo == null || !com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.activityInfo.packageName)) {
                return null;
            }
            return resolveInfo;
        }
    }

    /* compiled from: PackageManagerStub.java */
    /* loaded from: classes.dex */
    static class z extends com.xinzhu.overmind.client.hook.e {
        z() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "resolveService";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int a5 = com.xinzhu.overmind.utils.r.a(objArr[2]);
            ResolveInfo C = com.xinzhu.overmind.client.frameworks.g.d().C((Intent) objArr[0], a5, (String) objArr[1], com.xinzhu.overmind.client.e.getUserId());
            if (C == null) {
                com.xinzhu.overmind.utils.helpers.c.f(objArr);
                ResolveInfo resolveInfo = (ResolveInfo) method.invoke(obj, objArr);
                if (resolveInfo == null || !com.xinzhu.overmind.client.hook.env.a.f(resolveInfo.serviceInfo.packageName)) {
                    return null;
                }
                return resolveInfo;
            }
            return C;
        }
    }

    public c() {
        super(com.xinzhu.haunted.android.app.g.b0().asBinder());
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        PackageManager n4 = new com.xinzhu.haunted.android.app.l(new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).R()).n();
        if (n4 != null) {
            try {
                if (com.xinzhu.overmind.utils.t.n("android.app.ApplicationPackageManager").f("mPM").j(n4) != getProxyInvocation()) {
                    return true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return getProxyInvocation() != com.xinzhu.haunted.android.app.g.b0();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return com.xinzhu.haunted.android.app.g.b0();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        com.xinzhu.haunted.android.app.g.s0((IInterface) obj2);
        replaceSystemService("package");
        PackageManager n4 = new com.xinzhu.haunted.android.app.l(new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).R()).n();
        if (n4 != null) {
            try {
                com.xinzhu.overmind.utils.t.n("android.app.ApplicationPackageManager").f("mPM").r(n4, obj2);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        ContextFixer.fix(Overmind.getContext());
        try {
            Class.forName("huawei.android.app.HwApiCacheMangerEx");
            com.xinzhu.haunted.app.a c5 = com.xinzhu.haunted.app.a.c();
            if (c5.a()) {
                c5.e(Overmind.getPackageManager());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new y());
        addMethodHook(new h());
        addMethodHook(new b0());
        addMethodHook(new k());
        addMethodHook(new o());
        addMethodHook(new q());
        addMethodHook(new e());
        addMethodHook(new p());
        addMethodHook(new i());
        addMethodHook(new j());
        addMethodHook(new g());
        addMethodHook(new s());
        addMethodHook(new z());
        addMethodHook(new x());
        addMethodHook(new b());
        addMethodHook(new m());
        addMethodHook(new n());
        addMethodHook(new f());
        addMethodHook(new a0());
        addMethodHook(new a("checkPermission", 1, com.xinzhu.overmind.client.hook.common.d.f67578g));
        addMethodHook(new t());
        addMethodHook(new w());
        addMethodHook(new v());
        addMethodHook(new u());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("getInstallerPackageName", com.xinzhu.overmind.client.hook.env.b.f67615e));
        if (com.xinzhu.overmind.utils.e.w()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("notifyDexLoad", 0));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("notifyPackageUse", 0));
            Boolean bool = Boolean.FALSE;
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("setInstantAppCookie", bool));
            addMethodHook(new com.xinzhu.overmind.client.hook.common.c("isInstantApp", bool));
        }
        Boolean bool2 = Boolean.TRUE;
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("performDexOpt", bool2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("performDexOptIfNeeded", Boolean.FALSE));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("performDexOptSecondary", bool2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addOnPermissionsChangeListener", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("removeOnPermissionsChangeListener", 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addPermissionAsync", bool2));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addPermission", bool2));
        addMethodHook(new d());
        addMethodHook(new C0739c());
        addMethodHook(new r());
        addMethodHook(new l());
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("shouldShowRequestPermissionRationale", com.xinzhu.overmind.client.hook.common.d.f67577f, com.xinzhu.overmind.client.hook.common.d.f67578g));
    }
}
