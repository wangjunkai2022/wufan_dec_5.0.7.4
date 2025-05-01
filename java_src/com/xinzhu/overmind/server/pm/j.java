package com.xinzhu.overmind.server.pm;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.util.ArrayMap;
import android.util.ArraySet;
import androidx.annotation.RequiresApi;
import com.xinzhu.haunted.android.content.pm.j;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.IOManager;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.server.g;
import com.xinzhu.overmind.server.pm.MindPackage;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* compiled from: PackageManagerCompat.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68200a = "j";

    private static boolean a(int i4, MindPackageUserState mindPackageUserState, ApplicationInfo applicationInfo) {
        return (com.xinzhu.overmind.client.hook.env.a.c(applicationInfo.packageName) || !mindPackageUserState.f68144b || mindPackageUserState.f68146d) ? false : true;
    }

    @SuppressLint({"NewApi"})
    public static ApplicationInfo b(ApplicationInfo applicationInfo) {
        MindPackageSettings k4;
        if (applicationInfo == null) {
            return null;
        }
        boolean isVirtualProcess = Overmind.get().isVirtualProcess();
        if (isVirtualProcess && Overmind.get().isUseGlobalFakePath()) {
            ApplicationInfo applicationInfo2 = new ApplicationInfo(applicationInfo);
            applicationInfo2.dataDir = IOManager.get().restoreRedirectPath(applicationInfo2.dataDir);
            applicationInfo2.nativeLibraryDir = IOManager.get().restoreRedirectPath(applicationInfo2.nativeLibraryDir);
            applicationInfo2.publicSourceDir = IOManager.get().restoreRedirectPath(applicationInfo2.publicSourceDir);
            applicationInfo2.sourceDir = IOManager.get().restoreRedirectPath(applicationInfo2.sourceDir);
            if (com.xinzhu.overmind.utils.e.d()) {
                applicationInfo2.deviceProtectedDataDir = IOManager.get().restoreRedirectPath(applicationInfo2.deviceProtectedDataDir);
                try {
                    com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(applicationInfo2);
                    if (bVar.g()) {
                        bVar.M0(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (bVar.c()) {
                        bVar.I0(applicationInfo2.dataDir);
                    }
                    if (bVar.h()) {
                        bVar.N0(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (bVar.d()) {
                        bVar.J0(applicationInfo2.dataDir);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return applicationInfo2;
        }
        if (!isVirtualProcess) {
            if (Overmind.get().isServerProcess()) {
                k4 = i.get().getMindPackageSettings(applicationInfo.packageName);
            } else {
                k4 = com.xinzhu.overmind.client.frameworks.g.d().k(applicationInfo.packageName);
            }
            if (k4 == null) {
                return applicationInfo;
            }
            InstallOption installOption = k4.f68131d;
            boolean z4 = true;
            z4 = (installOption == null || !installOption.c(1)) ? false : false;
            if (k4.k() && !z4) {
                com.xinzhu.overmind.b.l(f68200a, "transformApplicationInfo " + applicationInfo.packageName);
                int k5 = MindUserHandle.k(applicationInfo.uid);
                ApplicationInfo applicationInfo3 = new ApplicationInfo(applicationInfo);
                applicationInfo3.dataDir = com.xinzhu.overmind.a.r(applicationInfo3.packageName, k5).getAbsolutePath();
                applicationInfo3.nativeLibraryDir = new File(com.xinzhu.overmind.a.f(applicationInfo3.packageName), com.xinzhu.overmind.a.K(k4.d())).getAbsolutePath();
                applicationInfo3.publicSourceDir = com.xinzhu.overmind.a.j(applicationInfo3.packageName).getAbsolutePath();
                applicationInfo3.sourceDir = com.xinzhu.overmind.a.j(applicationInfo3.packageName).getAbsolutePath();
                if (!com.xinzhu.overmind.utils.d.o(applicationInfo3.splitNames)) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : applicationInfo3.splitNames) {
                        arrayList.add(com.xinzhu.overmind.a.S(applicationInfo3.packageName, str).getAbsolutePath());
                    }
                    applicationInfo3.splitPublicSourceDirs = (String[]) arrayList.toArray(new String[0]);
                    applicationInfo3.splitSourceDirs = (String[]) arrayList.toArray(new String[0]);
                }
                if (com.xinzhu.overmind.utils.e.d()) {
                    applicationInfo3.deviceProtectedDataDir = com.xinzhu.overmind.a.x(applicationInfo3.packageName, k5).getAbsolutePath();
                    try {
                        com.xinzhu.haunted.android.content.pm.b bVar2 = new com.xinzhu.haunted.android.content.pm.b(applicationInfo3);
                        if (bVar2.g()) {
                            bVar2.M0(applicationInfo3.deviceProtectedDataDir);
                        }
                        if (bVar2.c()) {
                            bVar2.I0(applicationInfo3.dataDir);
                        }
                        if (bVar2.h()) {
                            bVar2.N0(applicationInfo3.deviceProtectedDataDir);
                        }
                        if (bVar2.d()) {
                            bVar2.J0(applicationInfo3.dataDir);
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                return applicationInfo3;
            }
        }
        return applicationInfo;
    }

    @SuppressLint({"NewApi"})
    private static void c(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(applicationInfo);
        if (com.xinzhu.overmind.utils.e.g()) {
            g.b m4 = m("android.test.base");
            if (m4 != null) {
                hashSet.add(m4.f67987b);
                if (com.xinzhu.overmind.utils.e.h()) {
                    com.xinzhu.haunted.android.content.pm.m d5 = com.xinzhu.haunted.android.content.pm.m.d(m4.f67987b, null, null, m4.f67986a, 0L, 0, null, null, null, false);
                    Objects.requireNonNull(d5);
                    arrayList.add((SharedLibraryInfo) d5.f66557a);
                }
            } else {
                com.xinzhu.overmind.b.c(f68200a, "sharedLibraryFiles skip library android.test.base");
            }
        }
        if (com.xinzhu.overmind.utils.e.h()) {
            g.b m5 = m("org.apache.http.legacy");
            if (m5 != null) {
                com.xinzhu.haunted.android.content.pm.m d6 = com.xinzhu.haunted.android.content.pm.m.d(m5.f67987b, null, null, m5.f67986a, 0L, 0, null, null, null, false);
                Objects.requireNonNull(d6);
                arrayList.add((SharedLibraryInfo) d6.f66557a);
            } else {
                com.xinzhu.overmind.b.c(f68200a, "sharedLibraryFiles skip library org.apache.http.legacy");
            }
        }
        bVar.o1(arrayList);
        if (com.xinzhu.overmind.utils.e.f()) {
            if (!com.xinzhu.overmind.utils.k.m("/system/framework/org.apache.http.legacy.jar")) {
                hashSet.add("/system/framework/org.apache.http.legacy.boot.jar");
            } else {
                hashSet.add("/system/framework/org.apache.http.legacy.jar");
            }
        } else {
            hashSet.add("/system/framework/org.apache.http.legacy.boot.jar");
        }
        hashSet.add(com.xinzhu.overmind.a.f67440h.getAbsolutePath());
        applicationInfo.sharedLibraryFiles = (String[]) hashSet.toArray(new String[0]);
        if (com.xinzhu.overmind.client.hook.env.b.f(applicationInfo.packageName)) {
            applicationInfo.flags |= 9;
        }
    }

    public static PackageInfo d(PackageInfo packageInfo) {
        ProviderInfo[] providerInfoArr;
        ServiceInfo[] serviceInfoArr;
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        if (packageInfo == null) {
            return null;
        }
        packageInfo.applicationInfo = b(packageInfo.applicationInfo);
        if (!com.xinzhu.overmind.utils.d.o(packageInfo.activities)) {
            for (ActivityInfo activityInfo : packageInfo.activities) {
                activityInfo.applicationInfo = b(activityInfo.applicationInfo);
            }
        }
        if (!com.xinzhu.overmind.utils.d.o(packageInfo.receivers)) {
            for (ActivityInfo activityInfo2 : packageInfo.receivers) {
                activityInfo2.applicationInfo = b(activityInfo2.applicationInfo);
            }
        }
        if (!com.xinzhu.overmind.utils.d.o(packageInfo.services)) {
            for (ServiceInfo serviceInfo : packageInfo.services) {
                serviceInfo.applicationInfo = b(serviceInfo.applicationInfo);
            }
        }
        if (!com.xinzhu.overmind.utils.d.o(packageInfo.providers)) {
            for (ProviderInfo providerInfo : packageInfo.providers) {
                providerInfo.applicationInfo = b(providerInfo.applicationInfo);
            }
        }
        return packageInfo;
    }

    public static ActivityInfo e(MindPackage.b bVar, int i4, MindPackageUserState mindPackageUserState, int i5) {
        Bundle bundle;
        if (a(i4, mindPackageUserState, bVar.f68070f.applicationInfo)) {
            ActivityInfo activityInfo = new ActivityInfo(bVar.f68070f);
            if ((i4 & 128) != 0 && (bundle = bVar.f68074d) != null) {
                activityInfo.metaData = bundle;
            }
            activityInfo.processName = i.fixProcessName(activityInfo.packageName, activityInfo.processName);
            activityInfo.applicationInfo = f(bVar.f68071a, i4, mindPackageUserState, i5);
            activityInfo.enabled = i.get().isComponentEnabled(activityInfo, i5);
            return activityInfo;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public static ApplicationInfo f(MindPackage mindPackage, int i4, MindPackageUserState mindPackageUserState, int i5) {
        String absolutePath;
        String[] strArr;
        File S;
        if (a(i4, mindPackageUserState, mindPackage.f68051s)) {
            MindPackageSettings mindPackageSettingsInternal = i.get().getMindPackageSettingsInternal(mindPackage.f68045m);
            boolean k4 = mindPackageSettingsInternal.k();
            ApplicationInfo applicationInfo = new ApplicationInfo(mindPackage.f68051s);
            InstallOption installOption = mindPackageSettingsInternal.f68131d;
            boolean z4 = true;
            z4 = (installOption == null || !installOption.c(1)) ? false : false;
            if (z4) {
                absolutePath = mindPackage.f68054v;
            } else if (k4) {
                absolutePath = com.xinzhu.overmind.a.k(mindPackage.f68045m).getAbsolutePath();
            } else {
                absolutePath = com.xinzhu.overmind.a.j(mindPackage.f68045m).getAbsolutePath();
            }
            if (mindPackage.f68051s == null) {
                mindPackage.f68051s = Overmind.getContext().getPackageManager().getPackageArchiveInfo(absolutePath, 0).applicationInfo;
            }
            ApplicationInfo applicationInfo2 = new ApplicationInfo(mindPackage.f68051s);
            if ((i4 & 128) != 0) {
                applicationInfo2.metaData = mindPackage.f68044l;
            }
            if (k4) {
                applicationInfo2.dataDir = com.xinzhu.overmind.a.s(applicationInfo2.packageName, i5).getAbsolutePath();
                applicationInfo2.nativeLibraryDir = new File(com.xinzhu.overmind.a.g(applicationInfo2.packageName), com.xinzhu.overmind.a.K(mindPackageSettingsInternal.d())).getAbsolutePath();
            } else {
                applicationInfo2.dataDir = com.xinzhu.overmind.a.r(applicationInfo2.packageName, i5).getAbsolutePath();
                applicationInfo2.nativeLibraryDir = new File(com.xinzhu.overmind.a.f(applicationInfo2.packageName), com.xinzhu.overmind.a.K(mindPackageSettingsInternal.d())).getAbsolutePath();
            }
            applicationInfo2.processName = i.fixProcessName(mindPackage.f68045m, applicationInfo2.packageName);
            applicationInfo2.publicSourceDir = absolutePath;
            applicationInfo2.sourceDir = absolutePath;
            if (!z4 && !com.xinzhu.overmind.utils.d.o(mindPackage.f68053u)) {
                applicationInfo2.splitNames = mindPackage.f68053u;
                ArrayList arrayList = new ArrayList();
                for (String str : mindPackage.f68053u) {
                    if (k4) {
                        S = com.xinzhu.overmind.a.T(mindPackage.f68045m, str);
                    } else {
                        S = com.xinzhu.overmind.a.S(mindPackage.f68045m, str);
                    }
                    arrayList.add(S.getAbsolutePath());
                }
                applicationInfo2.splitPublicSourceDirs = (String[]) arrayList.toArray(new String[0]);
                applicationInfo2.splitSourceDirs = (String[]) arrayList.toArray(new String[0]);
            }
            applicationInfo2.uid = MindUserHandle.h(i5, mindPackageSettingsInternal.f68130c);
            com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(applicationInfo2);
            com.xinzhu.haunted.android.content.pm.b bVar2 = new com.xinzhu.haunted.android.content.pm.b(applicationInfo);
            if (com.xinzhu.overmind.utils.e.a()) {
                bVar.b1(mindPackageSettingsInternal.d());
                bVar.i1(bVar2.s0());
                bVar.j1(bVar2.t0());
            }
            if (com.xinzhu.overmind.utils.e.d()) {
                if (k4) {
                    applicationInfo2.deviceProtectedDataDir = com.xinzhu.overmind.a.y(mindPackage.f68045m, i5).getAbsolutePath();
                } else {
                    applicationInfo2.deviceProtectedDataDir = com.xinzhu.overmind.a.x(mindPackage.f68045m, i5).getAbsolutePath();
                }
                try {
                    if (bVar.g()) {
                        bVar.M0(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (bVar.c()) {
                        bVar.I0(applicationInfo2.dataDir);
                    }
                    if (bVar.h()) {
                        bVar.N0(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (bVar.d()) {
                        bVar.J0(applicationInfo2.dataDir);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            c(applicationInfo2);
            return applicationInfo2;
        }
        return null;
    }

    public static final InstrumentationInfo g(MindPackage.d dVar, int i4) {
        Bundle bundle;
        if (dVar == null) {
            return null;
        }
        int i5 = i4 & 128;
        if (i5 == 0) {
            return dVar.f68076f;
        }
        InstrumentationInfo instrumentationInfo = new InstrumentationInfo(dVar.f68076f);
        if (i5 != 0 && (bundle = dVar.f68074d) != null) {
            instrumentationInfo.metaData = bundle;
        }
        return instrumentationInfo;
    }

    @SuppressLint({"NewApi"})
    public static PackageInfo h(MindPackage mindPackage, int i4, long j4, long j5, MindPackageUserState mindPackageUserState, int i5) {
        ServiceInfo l4;
        ActivityInfo e5;
        ActivityInfo e6;
        if (a(i4, mindPackageUserState, mindPackage.f68051s)) {
            PackageInfo packageInfo = new PackageInfo();
            Parcel obtain = Parcel.obtain();
            packageInfo.writeToParcel(obtain, 0);
            PackageInfo packageInfo2 = (PackageInfo) PackageInfo.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            packageInfo2.packageName = mindPackage.f68045m;
            packageInfo2.versionCode = mindPackage.f68050r;
            packageInfo2.versionName = mindPackage.f68052t;
            packageInfo2.sharedUserId = mindPackage.f68047o;
            packageInfo2.sharedUserLabel = mindPackage.f68055w;
            packageInfo2.applicationInfo = f(mindPackage, i4, mindPackageUserState, i5);
            packageInfo2.firstInstallTime = j4;
            packageInfo2.lastUpdateTime = j5;
            if (!mindPackage.f68041i.isEmpty()) {
                String[] strArr = new String[mindPackage.f68041i.size()];
                mindPackage.f68041i.toArray(strArr);
                packageInfo2.requestedPermissions = strArr;
            }
            if ((i4 & 256) != 0) {
                packageInfo2.gids = new int[0];
            }
            if ((i4 & 16384) != 0) {
                ArrayList<ConfigurationInfo> arrayList = mindPackage.f68056x;
                int size = arrayList != null ? arrayList.size() : 0;
                if (size > 0) {
                    ConfigurationInfo[] configurationInfoArr = new ConfigurationInfo[size];
                    packageInfo2.configPreferences = configurationInfoArr;
                    mindPackage.f68056x.toArray(configurationInfoArr);
                }
                ArrayList<FeatureInfo> arrayList2 = mindPackage.f68057y;
                int size2 = arrayList2 != null ? arrayList2.size() : 0;
                if (size2 > 0) {
                    FeatureInfo[] featureInfoArr = new FeatureInfo[size2];
                    packageInfo2.reqFeatures = featureInfoArr;
                    mindPackage.f68057y.toArray(featureInfoArr);
                }
            }
            if ((i4 & 1) != 0) {
                packageInfo2.activities = null;
                int size3 = mindPackage.f68034b.size();
                if (size3 > 0) {
                    ActivityInfo[] activityInfoArr = new ActivityInfo[size3];
                    int i6 = 0;
                    for (int i7 = 0; i7 < size3; i7++) {
                        MindPackage.b bVar = mindPackage.f68034b.get(i7);
                        if (i.get().isEnabledAndMatchLPr(bVar.f68070f, i4, i5) && (e6 = e(bVar, i4, mindPackageUserState, i5)) != null) {
                            e6.applicationInfo = packageInfo2.applicationInfo;
                            activityInfoArr[i6] = e6;
                            i6++;
                        }
                    }
                    packageInfo2.activities = (ActivityInfo[]) com.xinzhu.overmind.utils.d.p(activityInfoArr, i6);
                }
            }
            if ((i4 & 2) != 0) {
                packageInfo2.receivers = null;
                int size4 = mindPackage.f68035c.size();
                if (size4 > 0) {
                    ActivityInfo[] activityInfoArr2 = new ActivityInfo[size4];
                    int i8 = 0;
                    for (int i9 = 0; i9 < size4; i9++) {
                        MindPackage.b bVar2 = mindPackage.f68035c.get(i9);
                        if (i.get().isEnabledAndMatchLPr(bVar2.f68070f, i4, i5) && (e5 = e(bVar2, i4, mindPackageUserState, i5)) != null) {
                            e5.applicationInfo = packageInfo2.applicationInfo;
                            activityInfoArr2[i8] = e5;
                            i8++;
                        }
                    }
                    packageInfo2.receivers = (ActivityInfo[]) com.xinzhu.overmind.utils.d.p(activityInfoArr2, i8);
                }
            }
            if ((i4 & 4) != 0) {
                packageInfo2.services = null;
                int size5 = mindPackage.f68037e.size();
                if (size5 > 0) {
                    ServiceInfo[] serviceInfoArr = new ServiceInfo[size5];
                    int i10 = 0;
                    for (int i11 = 0; i11 < size5; i11++) {
                        MindPackage.h hVar = mindPackage.f68037e.get(i11);
                        if (i.get().isEnabledAndMatchLPr(hVar.f68080f, i4, i5) && (l4 = l(hVar, i4, mindPackageUserState, i5)) != null) {
                            l4.applicationInfo = packageInfo2.applicationInfo;
                            serviceInfoArr[i10] = l4;
                            i10++;
                        }
                    }
                    packageInfo2.services = (ServiceInfo[]) com.xinzhu.overmind.utils.d.p(serviceInfoArr, i10);
                }
            }
            if ((i4 & 8) != 0) {
                packageInfo2.providers = null;
                int size6 = mindPackage.f68036d.size();
                if (size6 > 0) {
                    ProviderInfo[] providerInfoArr = new ProviderInfo[size6];
                    int i12 = 0;
                    for (int i13 = 0; i13 < size6; i13++) {
                        MindPackage.g gVar = mindPackage.f68036d.get(i13);
                        ProviderInfo k4 = k(gVar, i4, mindPackageUserState, i5);
                        if (k4 != null && i.get().isEnabledAndMatchLPr(gVar.f68079f, i4, i5)) {
                            k4.applicationInfo = packageInfo2.applicationInfo;
                            providerInfoArr[i12] = k4;
                            i12++;
                        }
                    }
                    packageInfo2.providers = (ProviderInfo[]) com.xinzhu.overmind.utils.d.p(providerInfoArr, i12);
                }
            }
            if ((i4 & 16) != 0) {
                packageInfo2.instrumentation = null;
                int size7 = mindPackage.f68038f.size();
                if (size7 > 0) {
                    packageInfo2.instrumentation = new InstrumentationInfo[size7];
                    for (int i14 = 0; i14 < size7; i14++) {
                        packageInfo2.instrumentation[i14] = g(mindPackage.f68038f.get(i14), i4);
                    }
                }
            }
            if ((i4 & 4096) != 0) {
                packageInfo2.permissions = null;
                int size8 = mindPackage.f68039g.size();
                if (size8 > 0) {
                    packageInfo2.permissions = new PermissionInfo[size8];
                    for (int i15 = 0; i15 < size8; i15++) {
                        packageInfo2.permissions[i15] = j(mindPackage.f68039g.get(i15), i4);
                    }
                }
                packageInfo2.requestedPermissions = null;
                int size9 = mindPackage.f68041i.size();
                if (size9 > 0) {
                    packageInfo2.requestedPermissions = new String[size9];
                    packageInfo2.requestedPermissionsFlags = new int[size9];
                    for (int i16 = 0; i16 < size9; i16++) {
                        packageInfo2.requestedPermissions[i16] = mindPackage.f68041i.get(i16);
                    }
                }
            }
            if ((i4 & 64) != 0) {
                if (com.xinzhu.overmind.utils.e.u()) {
                    j.a aVar = new j.a(mindPackage.f68043k);
                    if (aVar.w()) {
                        packageInfo2.signatures = r10;
                        Signature[] r4 = aVar.r();
                        Objects.requireNonNull(r4);
                        Signature[] signatureArr = {r4[0]};
                    } else if (aVar.x()) {
                        packageInfo2.signatures = (Signature[]) mindPackage.f68043k.signatures.clone();
                    }
                } else {
                    packageInfo2.signatures = mindPackage.f68042j;
                }
            }
            if (com.xinzhu.overmind.utils.e.u() && (i4 & 134217728) != 0 && mindPackage.f68043k != null) {
                if (com.xinzhu.overmind.utils.e.j()) {
                    j.a aVar2 = new j.a(mindPackage.f68043k);
                    com.xinzhu.haunted.android.content.pm.n l5 = com.xinzhu.haunted.android.content.pm.n.l(aVar2.v() != null ? (Signature[]) aVar2.v().clone() : null, aVar2.u(), new ArraySet((ArraySet) aVar2.t()), aVar2.r() != null ? (Signature[]) aVar2.r().clone() : null);
                    Objects.requireNonNull(l5);
                    Object obj = l5.f66578a;
                    try {
                        Constructor declaredConstructor = SigningInfo.class.getDeclaredConstructor(com.xinzhu.haunted.android.content.pm.n.f66559c);
                        declaredConstructor.setAccessible(true);
                        packageInfo2.signingInfo = (SigningInfo) declaredConstructor.newInstance(obj);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    com.xinzhu.haunted.android.content.pm.o e7 = com.xinzhu.haunted.android.content.pm.o.e(mindPackage.f68043k);
                    Objects.requireNonNull(e7);
                    packageInfo2.signingInfo = (SigningInfo) e7.f66587a;
                }
            }
            return packageInfo2;
        }
        return null;
    }

    public static PackageInfo i(MindPackageSettings mindPackageSettings, int i4, MindPackageUserState mindPackageUserState, int i5) {
        MindPackage mindPackage;
        if (mindPackageSettings == null || (mindPackage = mindPackageSettings.f68129b) == null) {
            return null;
        }
        try {
            return h(mindPackage, i4, 0L, 0L, mindPackageUserState, i5);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static final PermissionInfo j(MindPackage.e eVar, int i4) {
        Bundle bundle;
        if (eVar == null) {
            return null;
        }
        int i5 = i4 & 128;
        if (i5 == 0) {
            return eVar.f68077f;
        }
        PermissionInfo permissionInfo = new PermissionInfo(eVar.f68077f);
        if (i5 != 0 && (bundle = eVar.f68074d) != null) {
            permissionInfo.metaData = bundle;
        }
        return permissionInfo;
    }

    public static final ProviderInfo k(MindPackage.g gVar, int i4, MindPackageUserState mindPackageUserState, int i5) {
        Bundle bundle;
        if (a(i4, mindPackageUserState, gVar.f68079f.applicationInfo)) {
            ProviderInfo providerInfo = new ProviderInfo(gVar.f68079f);
            if (providerInfo.authority == null) {
                return null;
            }
            if ((i4 & 128) != 0 && (bundle = gVar.f68074d) != null) {
                providerInfo.metaData = bundle;
            }
            providerInfo.processName = i.fixProcessName(providerInfo.packageName, providerInfo.processName);
            if ((i4 & 2048) == 0) {
                providerInfo.uriPermissionPatterns = null;
            }
            providerInfo.applicationInfo = f(gVar.f68071a, i4, mindPackageUserState, i5);
            providerInfo.enabled = i.get().isComponentEnabled(providerInfo, i5);
            return providerInfo;
        }
        return null;
    }

    public static final ServiceInfo l(MindPackage.h hVar, int i4, MindPackageUserState mindPackageUserState, int i5) {
        Bundle bundle;
        if (a(i4, mindPackageUserState, hVar.f68080f.applicationInfo)) {
            ServiceInfo serviceInfo = new ServiceInfo(hVar.f68080f);
            if ((i4 & 128) != 0 && (bundle = hVar.f68074d) != null) {
                serviceInfo.metaData = bundle;
            }
            serviceInfo.processName = i.fixProcessName(serviceInfo.packageName, serviceInfo.processName);
            serviceInfo.applicationInfo = f(hVar.f68071a, i4, mindPackageUserState, i5);
            serviceInfo.enabled = i.get().isComponentEnabled(serviceInfo, i5);
            return serviceInfo;
        }
        return null;
    }

    @RequiresApi(api = 26)
    @SuppressLint({"BlockedPrivateApi", "PrivateApi"})
    private static g.b m(String str) {
        try {
            ArrayMap<String, g.b> b5 = com.xinzhu.overmind.server.g.a().b();
            if (b5 == null) {
                return null;
            }
            return b5.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
