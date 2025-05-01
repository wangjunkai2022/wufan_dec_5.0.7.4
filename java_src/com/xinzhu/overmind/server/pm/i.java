package com.xinzhu.overmind.server.pm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AtomicFile;
import androidx.core.util.ObjectsCompat;
import com.join.mgps.receiver.BootReceiver_;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.entity.pm.InstallResult;
import com.xinzhu.overmind.entity.pm.InstalledPackage;
import com.xinzhu.overmind.os.BinderHelper;
import com.xinzhu.overmind.server.pm.MindPackage;
import com.xinzhu.overmind.server.pm.e;
import com.xinzhu.overmind.server.user.MindUserHandle;
import com.xinzhu.overmind.server.user.MindUserInfo;
import com.xinzhu.overmind.utils.v;
import com.xinzhu.overmind.utils.wrappers.ObjectsWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: MindPackageManagerService.java */
/* loaded from: classes.dex */
public class i extends e.b implements com.xinzhu.overmind.server.d {
    public static final String TAG = i.class.getSimpleName();
    public static i sService = new i();
    private static com.xinzhu.overmind.server.user.c sUserManager = com.xinzhu.overmind.server.user.c.get();
    final b mComponentEnabledSettings;
    private com.xinzhu.overmind.server.pm.b mComponentResolver;
    final Object mInstallLock;
    private BroadcastReceiver mPackageChangedHandler;
    private List<k> mPackageMonitors;
    final Map<String, MindPackageSettings> mPackages;
    private final o mSettings;

    /* compiled from: MindPackageManagerService.java */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if (BootReceiver_.f53984a.equals(action) || BootReceiver_.f53985b.equals(action)) {
                i.this.mSettings.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindPackageManagerService.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<Integer, HashMap<ComponentName, Integer>> f68197a = new HashMap<>();

        public b() {
            c();
        }

        public void a(int i4) {
            synchronized (this.f68197a) {
                if (this.f68197a.containsKey(Integer.valueOf(i4))) {
                    this.f68197a.remove(Integer.valueOf(i4));
                }
                d();
            }
        }

        public int b(ComponentName componentName, int i4) {
            synchronized (this.f68197a) {
                if (this.f68197a.containsKey(Integer.valueOf(i4))) {
                    HashMap<ComponentName, Integer> hashMap = this.f68197a.get(Integer.valueOf(i4));
                    if (hashMap.containsKey(componentName)) {
                        return hashMap.get(componentName).intValue();
                    }
                }
                return 0;
            }
        }

        public void c() {
            Parcel obtain = Parcel.obtain();
            try {
                byte[] v2 = com.xinzhu.overmind.utils.k.v(com.xinzhu.overmind.a.A());
                obtain.unmarshall(v2, 0, v2.length);
                obtain.setDataPosition(0);
                HashMap readHashMap = obtain.readHashMap(HashMap.class.getClassLoader());
                synchronized (this.f68197a) {
                    this.f68197a.clear();
                    this.f68197a.putAll(readHashMap);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
            obtain.recycle();
        }

        public void d() {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.A());
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    obtain.writeMap(this.f68197a);
                    fileOutputStream = atomicFile.startWrite();
                    com.xinzhu.overmind.utils.k.z(obtain, fileOutputStream);
                    atomicFile.finishWrite(fileOutputStream);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    atomicFile.failWrite(fileOutputStream);
                }
            } finally {
                obtain.recycle();
            }
        }

        public void e(ComponentName componentName, int i4, int i5, int i6) {
            HashMap<ComponentName, Integer> hashMap;
            synchronized (this.f68197a) {
                if (this.f68197a.containsKey(Integer.valueOf(i6))) {
                    hashMap = this.f68197a.get(Integer.valueOf(i6));
                } else {
                    hashMap = new HashMap<>();
                }
                hashMap.put(componentName, Integer.valueOf(i4));
                this.f68197a.put(Integer.valueOf(i6), hashMap);
                d();
            }
        }
    }

    public i() {
        o oVar = new o();
        this.mSettings = oVar;
        this.mPackages = oVar.f68230a;
        this.mInstallLock = new Object();
        this.mPackageMonitors = new ArrayList();
        this.mComponentEnabledSettings = new b();
        this.mPackageChangedHandler = new a();
        this.mComponentResolver = new com.xinzhu.overmind.server.pm.b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BootReceiver_.f53984a);
        intentFilter.addAction(BootReceiver_.f53985b);
        intentFilter.addDataScheme("package");
        Overmind.getContext().registerReceiver(this.mPackageChangedHandler, intentFilter);
    }

    private ResolveInfo chooseBestActivity(Intent intent, String str, int i4, List<ResolveInfo> list) {
        if (list != null) {
            int size = list.size();
            if (size == 1) {
                return list.get(0);
            }
            if (size > 1) {
                ResolveInfo resolveInfo = list.get(0);
                ResolveInfo resolveInfo2 = list.get(1);
                if (resolveInfo.priority == resolveInfo2.priority && resolveInfo.preferredOrder == resolveInfo2.preferredOrder && resolveInfo.isDefault == resolveInfo2.isDefault) {
                    return list.get(0);
                }
                return list.get(0);
            }
            return null;
        }
        return null;
    }

    static int compareSignatures(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == null) {
            return signatureArr2 == null ? 1 : -1;
        } else if (signatureArr2 == null) {
            return -2;
        } else {
            if (signatureArr.length != signatureArr2.length) {
                return -3;
            }
            if (signatureArr.length == 1) {
                return signatureArr[0].equals(signatureArr2[0]) ? 0 : -3;
            }
            HashSet hashSet = new HashSet();
            for (Signature signature : signatureArr) {
                hashSet.add(signature);
            }
            HashSet hashSet2 = new HashSet();
            for (Signature signature2 : signatureArr2) {
                hashSet2.add(signature2);
            }
            return hashSet.equals(hashSet2) ? 0 : -3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String fixProcessName(String str, String str2) {
        return str2 == null ? str : str2;
    }

    public static i get() {
        return sService;
    }

    private ActivityInfo getActivity(ComponentName componentName, int i4, int i5) {
        int updateFlags = updateFlags(i4, i5);
        synchronized (this.mPackages) {
            MindPackage.b activity = this.mComponentResolver.getActivity(componentName);
            if (activity != null) {
                MindPackageSettings mindPackageSettings = this.mSettings.f68230a.get(componentName.getPackageName());
                if (mindPackageSettings == null) {
                    return null;
                }
                return j.e(activity, updateFlags, mindPackageSettings.i(i5), i5);
            }
            return null;
        }
    }

    private List<ApplicationInfo> getInstalledApplicationsListInternal(int i4, int i5, int i6) {
        ArrayList arrayList;
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                arrayList = new ArrayList(this.mPackages.size());
                for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
                    ApplicationInfo f5 = j.f(mindPackageSettings.f68129b, i4, mindPackageSettings.i(i5), i5);
                    if (f5 != null) {
                        arrayList.add(f5);
                    }
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private int getPackageUidInternal(String str, int i4, int i5, int i6) {
        synchronized (this.mPackages) {
            MindPackageSettings mindPackageSettings = this.mPackages.get(str);
            if (mindPackageSettings != null) {
                return MindUserHandle.h(i5, mindPackageSettings.f68130c);
            }
            return -1;
        }
    }

    private PackageParser.SigningDetails getSigningDetails(int i4) {
        synchronized (this.mPackages) {
            MindPackageSettings e5 = this.mSettings.e(MindUserHandle.a(i4));
            if (e5 != null) {
                return e5.f68129b.f68043k;
            }
            return PackageParser.SigningDetails.UNKNOWN;
        }
    }

    private InstallResult installPackageAsExistLocked(String str, int i4) {
        InstallResult installResult = new InstallResult();
        try {
            if (!sUserManager.exists(i4)) {
                sUserManager.createUser(i4);
            }
            installResult.f67791c = str;
            MindPackageSettings mindPackageSettings = this.mPackages.get(str);
            com.xinzhu.overmind.server.e.d().l(str, i4);
            if (h.get().installPackageAsExist(mindPackageSettings, i4) < 0) {
                return installResult.a("install apk error.");
            }
            synchronized (this.mPackages) {
                mindPackageSettings.n(true, i4);
                mindPackageSettings.l();
            }
            this.mSettings.j();
            onPackageInstalled(mindPackageSettings, i4);
            return installResult;
        } catch (Throwable th) {
            installResult.a("install as exist failed " + th.getMessage());
            th.printStackTrace();
            return installResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[Catch: all -> 0x0146, TRY_ENTER, TryCatch #1 {all -> 0x0149, blocks: (B:3:0x000d, B:5:0x0015, B:6:0x001a, B:8:0x0027, B:10:0x002e, B:12:0x0038, B:14:0x003f, B:16:0x004f, B:18:0x0052, B:20:0x0057, B:22:0x005f, B:24:0x006b, B:27:0x0078, B:30:0x007e, B:32:0x0091, B:34:0x0094, B:36:0x0097, B:38:0x00a3, B:40:0x00ab, B:41:0x00c9, B:42:0x00cc, B:44:0x00d8, B:47:0x00df, B:49:0x0110, B:50:0x0112, B:53:0x011a, B:56:0x012f, B:57:0x0145, B:48:0x00e7, B:51:0x0113, B:52:0x0119), top: B:64:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.xinzhu.overmind.entity.pm.InstallResult installPackageAsTransferLocked(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.i.installPackageAsTransferLocked(java.lang.String, int, int):com.xinzhu.overmind.entity.pm.InstallResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.xinzhu.overmind.entity.pm.InstallResult installPackageAsUserLocked(java.lang.String r10, com.xinzhu.overmind.entity.pm.InstallOption r11, int r12) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.i.installPackageAsUserLocked(java.lang.String, com.xinzhu.overmind.entity.pm.InstallOption, int):com.xinzhu.overmind.entity.pm.InstallResult");
    }

    private PackageParser.Package parserApk(String str) {
        try {
            com.xinzhu.haunted.android.content.pm.j k4 = com.xinzhu.haunted.android.content.pm.j.k();
            PackageParser.Package r12 = (PackageParser.Package) k4.l(new File(str), 0);
            if (com.xinzhu.overmind.utils.e.y()) {
                k4.j(r12, true);
            } else {
                k4.i(r12, 0);
            }
            return r12;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private List<ResolveInfo> queryIntentServicesInternal(Intent intent, String str, int i4, int i5) {
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ServiceInfo serviceInfo = getServiceInfo(component, i4, i5);
            if (serviceInfo != null && isEnabledAndMatchLPr(serviceInfo, i4, i5)) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = serviceInfo;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.mPackages) {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                return this.mComponentResolver.t(intent2, str, i4, i5);
            }
            MindPackageSettings mindPackageSettings = this.mPackages.get(str2);
            if (mindPackageSettings != null) {
                return this.mComponentResolver.u(intent2, str, i4, mindPackageSettings.f68129b.f68037e, i5);
            }
            return Collections.emptyList();
        }
    }

    private int updateFlags(int i4, int i5) {
        return (i4 & 786432) != 0 ? i4 : i4 | 786432;
    }

    public void addPackageMonitor(k kVar) {
        this.mPackageMonitors.add(kVar);
    }

    public int checkUidSignatures(int i4, int i5) {
        synchronized (this.mPackages) {
            MindPackageSettings e5 = this.mSettings.e(MindUserHandle.a(i4));
            if (e5 == null) {
                return -4;
            }
            MindPackageSettings e6 = this.mSettings.e(MindUserHandle.a(i5));
            if (e6 == null) {
                return -4;
            }
            return compareSignatures(e5.f68129b.f68042j, e6.f68129b.f68042j);
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void deleteUser(int i4) throws RemoteException {
        try {
            synchronized (this.mPackages) {
                for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
                    uninstallPackageAsUser(mindPackageSettings.f68129b.f68045m, i4);
                }
                this.mComponentEnabledSettings.a(i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void doTransferInstalls() throws RemoteException {
        com.xinzhu.overmind.b.a(TAG, "doTransferInstalls");
        com.xinzhu.datatransfer.a.a();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void doTransferInstallsOnlyForMainPackage() throws RemoteException {
        com.xinzhu.overmind.b.a(TAG, "doTransferInstallsOnlyForMainPackage");
        com.xinzhu.datatransfer.a.b();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ActivityInfo getActivityInfo(ComponentName componentName, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                MindPackage.b activity = this.mComponentResolver.getActivity(componentName);
                if (activity != null) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (mindPackageSettings != null && isEnabledAndMatchLPr(activity.f68070f, i4, i5)) {
                        return j.e(activity, i4, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public int getAppId(String str) {
        synchronized (this.mPackages) {
            MindPackageSettings mindPackageSettings = this.mPackages.get(str);
            if (mindPackageSettings != null) {
                return mindPackageSettings.f68130c;
            }
            return -1;
        }
    }

    public Resources getAppResources(String str, int i4) {
        try {
            ApplicationInfo b5 = j.b(getApplicationInfo(str, 0, i4));
            com.xinzhu.haunted.android.content.res.b e5 = com.xinzhu.haunted.android.content.res.b.e();
            e5.a(b5.publicSourceDir);
            Resources resources = Overmind.getContext().getResources();
            return new Resources((AssetManager) e5.f66679a, resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ApplicationInfo getApplicationInfo(String str, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            if (!ObjectsWrapper.equals(str, Overmind.getMainPkg()) && !ObjectsWrapper.equals(str, Overmind.getPluginPkg())) {
                int updateFlags = updateFlags(i4, i5);
                synchronized (this.mPackages) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(str);
                    if (mindPackageSettings != null) {
                        return j.f(mindPackageSettings.f68129b, updateFlags, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
            }
            try {
                return Overmind.getContext().getPackageManager().getApplicationInfo(str, i4);
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public int getComponentEnabledSetting(ComponentName componentName, int i4) throws RemoteException {
        int b5;
        synchronized (this.mComponentEnabledSettings) {
            b5 = this.mComponentEnabledSettings.b(componentName, i4);
        }
        return b5;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ApplicationInfo> getInstalledApplications(int i4, int i5) {
        return getInstalledApplicationsListInternal(i4, i5, Binder.getCallingUid());
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<PackageInfo> getInstalledPackages(int i4, int i5) {
        ArrayList arrayList;
        Binder.getCallingUid();
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                ArrayList arrayList2 = new ArrayList(this.mPackages.size());
                for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
                    PackageInfo packageInfo = getPackageInfo(mindPackageSettings.f68129b.f68045m, i4, i5);
                    if (packageInfo != null) {
                        arrayList2.add(packageInfo);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<InstalledPackage> getInstalledPackagesAsUser(int i4) {
        ArrayList arrayList;
        if (sUserManager.exists(i4)) {
            synchronized (this.mPackages) {
                arrayList = new ArrayList();
                for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
                    if (mindPackageSettings.c(i4)) {
                        InstalledPackage installedPackage = new InstalledPackage();
                        installedPackage.f67798b = i4;
                        installedPackage.f67799c = mindPackageSettings.f68129b.f68045m;
                        arrayList.add(installedPackage);
                    }
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public MindPackageSettings getMindPackageSettings(String str) {
        try {
            MindPackageSettings mindPackageSettingsInternal = getMindPackageSettingsInternal(str);
            if (mindPackageSettingsInternal != null) {
                Parcel obtain = Parcel.obtain();
                mindPackageSettingsInternal.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MindPackageSettings createFromParcel = MindPackageSettings.CREATOR.createFromParcel(obtain);
                createFromParcel.f68129b = null;
                obtain.recycle();
                return createFromParcel;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public MindPackageSettings getMindPackageSettingsInternal(String str) {
        return this.mPackages.get(str);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public PackageInfo getPackageInfo(String str, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            if (!ObjectsCompat.equals(str, Overmind.getMainPkg()) && !ObjectsCompat.equals(str, Overmind.getPluginPkg())) {
                int updateFlags = updateFlags(i4, i5);
                synchronized (this.mPackages) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(str);
                    if (mindPackageSettings != null) {
                        return j.i(mindPackageSettings, updateFlags, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
            }
            try {
                return Overmind.getContext().getPackageManager().getPackageInfo(str, i4);
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int getPackageUid(String str, int i4, int i5) {
        if (com.xinzhu.overmind.server.user.c.get().exists(i5)) {
            if (str.equals(q.a.f73126a) || str.equals(Overmind.getHostPkg())) {
                return 1000;
            }
            return getPackageUidInternal(str, i4, i5, BinderHelper.b().f67823c);
        }
        return -1;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public String[] getPackagesForUid(int i4) {
        int k4 = MindUserHandle.k(i4);
        ArrayList arrayList = new ArrayList();
        for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
            if (MindUserHandle.h(k4, mindPackageSettings.f68130c) == i4) {
                arrayList.add(mindPackageSettings.f68129b.f68045m);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ProviderInfo getProviderInfo(ComponentName componentName, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                MindPackage.g g4 = this.mComponentResolver.g(componentName);
                if (g4 != null) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (mindPackageSettings != null && isEnabledAndMatchLPr(g4.f68079f, i4, i5)) {
                        return j.k(g4, i4, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ActivityInfo getReceiverInfo(ComponentName componentName, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                MindPackage.b h4 = this.mComponentResolver.h(componentName);
                if (h4 != null) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (mindPackageSettings != null && isEnabledAndMatchLPr(h4.f68070f, i4, i5)) {
                        return j.e(h4, i4, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ServiceInfo getServiceInfo(ComponentName componentName, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            synchronized (this.mPackages) {
                MindPackage.h i6 = this.mComponentResolver.i(componentName);
                if (i6 != null) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (mindPackageSettings != null && isEnabledAndMatchLPr(i6.f68080f, i4, i5)) {
                        return j.l(i6, i4, mindPackageSettings.i(i5), i5);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    o getSettings() {
        return this.mSettings;
    }

    public boolean hasSignatureCapability(int i4, int i5, int i6) {
        String[] packagesForUid = Overmind.getContext().getPackageManager().getPackagesForUid(i5);
        if (packagesForUid != null && packagesForUid.length > 0) {
            for (String str : packagesForUid) {
                if (str.equals(Overmind.getMainPkg()) || str.equals(Overmind.getPluginPkg())) {
                    return true;
                }
            }
        }
        if (!com.xinzhu.overmind.utils.e.u()) {
            return i4 == i5 || checkUidSignatures(i4, i5) == 0;
        }
        PackageParser.SigningDetails signingDetails = getSigningDetails(i4);
        PackageParser.SigningDetails signingDetails2 = getSigningDetails(i5);
        return signingDetails.checkCapability(signingDetails2, i6) || signingDetails2.hasAncestorOrSelf(signingDetails);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public InstallResult installPackageAsExist(String str, int i4) {
        InstallResult installPackageAsExistLocked;
        synchronized (this.mInstallLock) {
            String str2 = TAG;
            com.xinzhu.overmind.b.c(str2, "installPackageAsExist " + str + " " + i4);
            installPackageAsExistLocked = installPackageAsExistLocked(str, i4);
        }
        return installPackageAsExistLocked;
    }

    public InstallResult installPackageAsTransfer(String str, int i4, int i5) {
        InstallResult installPackageAsTransferLocked;
        String str2 = TAG;
        com.xinzhu.overmind.b.a(str2, "installPackageAsTransfer " + str + " " + i4 + " " + i5);
        synchronized (this.mInstallLock) {
            installPackageAsTransferLocked = installPackageAsTransferLocked(str, i4, i5);
        }
        return installPackageAsTransferLocked;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public InstallResult installPackageAsUser(String str, InstallOption installOption, int i4) {
        synchronized (this.mInstallLock) {
            if (i4 == -1) {
                if (com.xinzhu.overmind.server.user.c.get().getUsers() != null && !com.xinzhu.overmind.server.user.c.get().getUsers().isEmpty()) {
                    InstallResult installResult = null;
                    for (MindUserInfo mindUserInfo : com.xinzhu.overmind.server.user.c.get().getUsers()) {
                        installResult = installPackageAsUserLocked(str, installOption, mindUserInfo.f68255b);
                        if (!installResult.f67790b) {
                            return installResult;
                        }
                    }
                    return installResult;
                }
                return new InstallResult().a("no user exist");
            }
            return installPackageAsUserLocked(str, installOption, i4);
        }
    }

    public boolean isComponentEnabled(ComponentInfo componentInfo, int i4) {
        int b5;
        synchronized (this.mComponentEnabledSettings) {
            b5 = this.mComponentEnabledSettings.b(new ComponentName(componentInfo.packageName, componentInfo.name), i4);
        }
        if (b5 != 0) {
            return b5 == 1;
        }
        return componentInfo.enabled;
    }

    public boolean isEnabledAndMatchLPr(ComponentInfo componentInfo, int i4, int i5) {
        if ((i4 & 512) != 0) {
            return true;
        }
        return isComponentEnabled(componentInfo, i5);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public boolean isInstalled(String str, int i4) {
        if (sUserManager.exists(i4)) {
            synchronized (this.mPackages) {
                MindPackageSettings mindPackageSettings = this.mPackages.get(str);
                if (mindPackageSettings == null) {
                    return false;
                }
                return mindPackageSettings.c(i4);
            }
        }
        return false;
    }

    void onPackageChanged(MindPackageSettings mindPackageSettings, int i4) {
        String str = mindPackageSettings.f68129b.f68045m;
        if (!Overmind.get().ifDisablePluginPackageAutoManage()) {
            if (mindPackageSettings.s()) {
                com.xinzhu.overmind.plugin.b.q(str, i4);
            }
            com.xinzhu.overmind.plugin.b.p();
        }
        for (k kVar : this.mPackageMonitors) {
            kVar.c(str, i4);
        }
        String str2 = TAG;
        v.a(str2, "onPackageChanged: " + str + ", userId: " + i4);
    }

    void onPackageInstalled(MindPackageSettings mindPackageSettings, int i4) {
        String str = mindPackageSettings.f68129b.f68045m;
        try {
            if (mindPackageSettings.f68131d.c(2)) {
                com.xinzhu.overmind.utils.g.a(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!Overmind.get().ifDisablePluginPackageAutoManage()) {
            if (mindPackageSettings.s()) {
                com.xinzhu.overmind.plugin.b.q(str, i4);
            }
            com.xinzhu.overmind.plugin.b.p();
        }
        for (k kVar : this.mPackageMonitors) {
            kVar.b(str, i4);
        }
        String str2 = TAG;
        v.a(str2, "onPackageInstalled: " + str + ", userId: " + i4);
        if (str.equals("com.tencent.mm")) {
            Overmind.get().preStartMM();
        }
    }

    void onPackageUninstalled(String str, int i4) {
        if (!Overmind.get().ifDisablePluginPackageAutoManage()) {
            com.xinzhu.overmind.plugin.b.p();
        }
        for (k kVar : this.mPackageMonitors) {
            kVar.a(str, i4);
        }
        String str2 = TAG;
        v.a(str2, "onPackageUninstalled: " + str + ", userId: " + i4);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ProviderInfo> queryContentProviders(String str, int i4, int i5, int i6) throws RemoteException {
        if (sUserManager.exists(i6)) {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            arrayList.addAll(this.mComponentResolver.q(str, null, i5, i6));
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ResolveInfo> queryIntentActivities(Intent intent, int i4, String str, int i5) {
        if (sUserManager.exists(i5)) {
            String str2 = intent.getPackage();
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo activityInfo = getActivityInfo(component, i4, i5);
                if (activityInfo != null && isEnabledAndMatchLPr(activityInfo, i4, i5)) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = activityInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                if (str2 != null) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(str2);
                    List<ResolveInfo> list = null;
                    if (mindPackageSettings != null) {
                        list = this.mComponentResolver.l(intent2, str, i4, mindPackageSettings.f68129b.f68034b, i5);
                    }
                    if ((list == null || list.size() == 0) && list == null) {
                        list = new ArrayList<>();
                    }
                    return list;
                }
                List<ResolveInfo> m4 = this.mComponentResolver.m(intent2, str, i4, i5);
                if ((m4 == null || m4.size() == 0) && m4 == null) {
                    m4 = new ArrayList<>();
                }
                return m4;
            }
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ResolveInfo> queryIntentBroadcastReceivers(Intent intent, int i4, String str, int i5) {
        if (sUserManager.exists(i5)) {
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo receiverInfo = getReceiverInfo(component, i4, i5);
                if (receiverInfo != null && isEnabledAndMatchLPr(receiverInfo, i4, i5)) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = receiverInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                String str2 = intent2.getPackage();
                if (str2 == null) {
                    return this.mComponentResolver.r(intent2, str, i4, i5);
                }
                MindPackageSettings mindPackageSettings = this.mPackages.get(str2);
                if (mindPackageSettings != null) {
                    return this.mComponentResolver.s(intent2, str, i4, mindPackageSettings.f68129b.f68035c, i5);
                }
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i4, String str, int i5) {
        if (sUserManager.exists(i5)) {
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ProviderInfo providerInfo = getProviderInfo(component, i4, i5);
                if (providerInfo != null && isEnabledAndMatchLPr(providerInfo, i4, i5)) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.providerInfo = providerInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                String str2 = intent2.getPackage();
                if (str2 == null) {
                    return this.mComponentResolver.o(intent2, str, i4, i5);
                }
                MindPackageSettings mindPackageSettings = this.mPackages.get(str2);
                if (mindPackageSettings != null) {
                    return this.mComponentResolver.p(intent2, str, i4, mindPackageSettings.f68129b.f68036d, i5);
                }
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public List<ResolveInfo> queryIntentServices(Intent intent, int i4, String str, int i5) {
        return queryIntentServicesInternal(intent, str, i4, i5);
    }

    public void removePackageMonitor(k kVar) {
        this.mPackageMonitors.add(kVar);
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ResolveInfo resolveActivity(Intent intent, int i4, String str, int i5) {
        if (sUserManager.exists(i5)) {
            return chooseBestActivity(intent, str, i4, queryIntentActivities(intent, i4, str, i5));
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ProviderInfo resolveContentProvider(String str, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            return this.mComponentResolver.n(str, i4, i5);
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ResolveInfo resolveIntent(Intent intent, String str, int i4, int i5) {
        if (sUserManager.exists(i5)) {
            return chooseBestActivity(intent, str, i4, queryIntentActivities(intent, i4, str, i5));
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public ResolveInfo resolveService(Intent intent, int i4, String str, int i5) {
        List<ResolveInfo> queryIntentServicesInternal;
        if (sUserManager.exists(i5) && (queryIntentServicesInternal = queryIntentServicesInternal(intent, str, i4, i5)) != null && queryIntentServicesInternal.size() >= 1) {
            return queryIntentServicesInternal.get(0);
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void setComponentEnabledSetting(ComponentName componentName, int i4, int i5, int i6) throws RemoteException {
        synchronized (this.mComponentEnabledSettings) {
            this.mComponentEnabledSettings.e(componentName, i4, i5, i6);
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void setMindPackageRunWithPlugin(String str, boolean z4) throws RemoteException {
        synchronized (this.mPackages) {
            MindPackageSettings mindPackageSettings = this.mPackages.get(str);
            if (mindPackageSettings != null) {
                mindPackageSettings.o(z4);
                mindPackageSettings.l();
                try {
                    if (mindPackageSettings.f68131d.c(2)) {
                        com.xinzhu.overmind.utils.k.j(com.xinzhu.overmind.a.L(str));
                        com.xinzhu.overmind.utils.g.a(str);
                        com.xinzhu.overmind.plugin.b.q(str, 0);
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
        this.mSettings.j();
        for (MindPackageSettings mindPackageSettings : this.mPackages.values()) {
            this.mComponentResolver.c(mindPackageSettings.f68129b);
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void uninstallPackage(String str) {
        synchronized (this.mInstallLock) {
            synchronized (this.mPackages) {
                MindPackageSettings mindPackageSettings = this.mPackages.get(str);
                if (mindPackageSettings == null) {
                    return;
                }
                com.xinzhu.overmind.server.e.d().k(str);
                for (Integer num : mindPackageSettings.f()) {
                    if (h.get().uninstallPackageAsUser(mindPackageSettings, true, num.intValue()) >= 0) {
                        onPackageUninstalled(str, num.intValue());
                    }
                }
                this.mPackages.remove(str);
                this.mComponentResolver.v(mindPackageSettings.f68129b);
                this.mSettings.j();
            }
        }
    }

    @Override // com.xinzhu.overmind.server.pm.e
    public void uninstallPackageAsUser(String str, int i4) throws RemoteException {
        try {
            synchronized (this.mInstallLock) {
                synchronized (this.mPackages) {
                    MindPackageSettings mindPackageSettings = this.mPackages.get(str);
                    if (mindPackageSettings == null) {
                        return;
                    }
                    if (isInstalled(str, i4)) {
                        boolean z4 = true;
                        if (mindPackageSettings.g().size() > 1) {
                            z4 = false;
                        }
                        com.xinzhu.overmind.server.e.d().l(str, i4);
                        h.get().uninstallPackageAsUser(mindPackageSettings, z4, i4);
                        if (z4) {
                            this.mPackages.remove(str);
                            this.mComponentResolver.v(mindPackageSettings.f68129b);
                            this.mSettings.j();
                        } else {
                            mindPackageSettings.j(i4);
                            mindPackageSettings.l();
                        }
                        onPackageUninstalled(str, i4);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
