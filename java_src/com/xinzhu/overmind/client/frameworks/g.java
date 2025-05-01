package com.xinzhu.overmind.client.frameworks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.entity.pm.InstallResult;
import com.xinzhu.overmind.entity.pm.InstalledPackage;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import com.xinzhu.overmind.server.pm.e;
import java.util.Collections;
import java.util.List;
/* compiled from: MindPackageManager.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67559b = "g";

    /* renamed from: c  reason: collision with root package name */
    private static g f67560c = new g();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.pm.e f67561a;

    private void a(Throwable th) {
        th.printStackTrace();
    }

    public static g d() {
        return f67560c;
    }

    public ProviderInfo A(String str, int i4, int i5) {
        try {
            return p().resolveContentProvider(str, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public ResolveInfo B(Intent intent, String str, int i4, int i5) {
        try {
            return p().resolveIntent(intent, str, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public ResolveInfo C(Intent intent, int i4, String str, int i5) {
        try {
            return p().resolveService(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public void D(String str, boolean z4) {
        try {
            p().setMindPackageRunWithPlugin(str, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void E(String str) {
        try {
            p().uninstallPackage(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void F(String str, int i4) {
        try {
            p().uninstallPackageAsUser(str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void b() {
        try {
            p().doTransferInstalls();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void c() {
        try {
            p().doTransferInstallsOnlyForMainPackage();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public ActivityInfo e(ComponentName componentName, int i4, int i5) {
        try {
            return p().getActivityInfo(componentName, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public ApplicationInfo f(String str, int i4, int i5) {
        try {
            return p().getApplicationInfo(str, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public List<ApplicationInfo> g(int i4, int i5) {
        try {
            return p().getInstalledApplications(i4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<PackageInfo> h(int i4, int i5) {
        try {
            return p().getInstalledPackages(i4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<InstalledPackage> i(int i4) {
        try {
            return p().getInstalledPackagesAsUser(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Intent j(String str, int i4) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> v2 = v(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4);
        if (v2 == null || v2.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            v2 = v(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4);
        }
        if (v2 == null || v2.size() <= 0) {
            intent.removeCategory("android.intent.category.LAUNCHER");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
            v2 = v(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4);
        }
        if (v2 == null || v2.size() <= 0) {
            intent.removeCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.default");
            intent.setPackage(str);
            v2 = v(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4);
        }
        if (v2 == null || v2.size() <= 0) {
            intent.removeCategory("android.intent.category.default");
            intent.setPackage(str);
            intent.setAction("android.intent.action.MAIN");
            v2 = v(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4);
        }
        if (v2 == null || v2.size() <= 0) {
            return null;
        }
        String str2 = f67559b;
        com.xinzhu.overmind.b.a(str2, "getLaunchIntentForPackage get " + v2.get(0).activityInfo.name);
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setClassName(v2.get(0).activityInfo.packageName, v2.get(0).activityInfo.name);
        return intent2;
    }

    public MindPackageSettings k(String str) {
        try {
            return p().getMindPackageSettings(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public PackageInfo l(String str, int i4, int i5) {
        try {
            return p().getPackageInfo(str, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public String[] m(int i4) {
        try {
            return p().getPackagesForUid(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ProviderInfo n(ComponentName componentName, int i4, int i5) {
        try {
            return p().getProviderInfo(componentName, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public ActivityInfo o(ComponentName componentName, int i4, int i5) {
        try {
            return p().getReceiverInfo(componentName, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public com.xinzhu.overmind.server.pm.e p() {
        com.xinzhu.overmind.server.pm.e eVar = this.f67561a;
        if (eVar != null && eVar.asBinder().isBinderAlive()) {
            return this.f67561a;
        }
        this.f67561a = e.b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67994f));
        return p();
    }

    public ServiceInfo q(ComponentName componentName, int i4, int i5) {
        try {
            return p().getServiceInfo(componentName, i4, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public InstallResult r(String str, int i4) {
        try {
            return p().installPackageAsExist(str, i4);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public InstallResult s(String str, InstallOption installOption, int i4) {
        try {
            return p().installPackageAsUser(str, installOption, i4);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public boolean t(String str, int i4) {
        try {
            return p().isInstalled(str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public List<ProviderInfo> u(String str, int i4, int i5, int i6) {
        try {
            return p().queryContentProviders(str, i4, i5, i6);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public List<ResolveInfo> v(Intent intent, int i4, String str, int i5) {
        try {
            return p().queryIntentActivities(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public List<ResolveInfo> w(Intent intent, int i4, String str, int i5) {
        try {
            return p().queryIntentBroadcastReceivers(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public List<ResolveInfo> x(Intent intent, int i4, String str, int i5) {
        try {
            return p().queryIntentContentProviders(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public List<ResolveInfo> y(Intent intent, int i4, String str, int i5) {
        try {
            return p().queryIntentServices(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }

    public ResolveInfo z(Intent intent, int i4, String str, int i5) {
        try {
            return p().resolveActivity(intent, i4, str, i5);
        } catch (RemoteException e5) {
            a(e5);
            return null;
        }
    }
}
