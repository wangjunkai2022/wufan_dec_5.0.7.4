package com.xinzhu.overmind.server.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.entity.pm.InstallResult;
import com.xinzhu.overmind.entity.pm.InstalledPackage;
import java.util.List;
/* compiled from: IMindPackageManagerService.java */
/* loaded from: classes.dex */
public interface e extends IInterface {

    /* compiled from: IMindPackageManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void deleteUser(int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void doTransferInstalls() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void doTransferInstallsOnlyForMainPackage() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ActivityInfo getActivityInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ApplicationInfo getApplicationInfo(String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public int getComponentEnabledSetting(ComponentName componentName, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ApplicationInfo> getInstalledApplications(int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<PackageInfo> getInstalledPackages(int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<InstalledPackage> getInstalledPackagesAsUser(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public MindPackageSettings getMindPackageSettings(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public PackageInfo getPackageInfo(String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public String[] getPackagesForUid(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ProviderInfo getProviderInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ActivityInfo getReceiverInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ServiceInfo getServiceInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public InstallResult installPackageAsExist(String str, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public InstallResult installPackageAsUser(String str, InstallOption installOption, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public boolean isInstalled(String str, int i4) throws RemoteException {
            return false;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ProviderInfo> queryContentProviders(String str, int i4, int i5, int i6) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ResolveInfo> queryIntentActivities(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ResolveInfo> queryIntentBroadcastReceivers(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public List<ResolveInfo> queryIntentServices(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ResolveInfo resolveActivity(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ProviderInfo resolveContentProvider(String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ResolveInfo resolveIntent(Intent intent, String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public ResolveInfo resolveService(Intent intent, int i4, String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void setComponentEnabledSetting(ComponentName componentName, int i4, int i5, int i6) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void setMindPackageRunWithPlugin(String str, boolean z4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void uninstallPackage(String str) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.e
        public void uninstallPackageAsUser(String str, int i4) throws RemoteException {
        }
    }

    /* compiled from: IMindPackageManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements e {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.pm.IMindPackageManagerService";
        static final int TRANSACTION_deleteUser = 22;
        static final int TRANSACTION_doTransferInstalls = 29;
        static final int TRANSACTION_doTransferInstallsOnlyForMainPackage = 30;
        static final int TRANSACTION_getActivityInfo = 9;
        static final int TRANSACTION_getApplicationInfo = 5;
        static final int TRANSACTION_getComponentEnabledSetting = 26;
        static final int TRANSACTION_getInstalledApplications = 11;
        static final int TRANSACTION_getInstalledPackages = 12;
        static final int TRANSACTION_getInstalledPackagesAsUser = 24;
        static final int TRANSACTION_getMindPackageSettings = 27;
        static final int TRANSACTION_getPackageInfo = 6;
        static final int TRANSACTION_getPackagesForUid = 31;
        static final int TRANSACTION_getProviderInfo = 10;
        static final int TRANSACTION_getReceiverInfo = 8;
        static final int TRANSACTION_getServiceInfo = 7;
        static final int TRANSACTION_installPackageAsExist = 19;
        static final int TRANSACTION_installPackageAsUser = 18;
        static final int TRANSACTION_isInstalled = 23;
        static final int TRANSACTION_queryContentProviders = 17;
        static final int TRANSACTION_queryIntentActivities = 13;
        static final int TRANSACTION_queryIntentBroadcastReceivers = 15;
        static final int TRANSACTION_queryIntentContentProviders = 16;
        static final int TRANSACTION_queryIntentServices = 14;
        static final int TRANSACTION_resolveActivity = 2;
        static final int TRANSACTION_resolveContentProvider = 3;
        static final int TRANSACTION_resolveIntent = 4;
        static final int TRANSACTION_resolveService = 1;
        static final int TRANSACTION_setComponentEnabledSetting = 25;
        static final int TRANSACTION_setMindPackageRunWithPlugin = 28;
        static final int TRANSACTION_uninstallPackage = 21;
        static final int TRANSACTION_uninstallPackageAsUser = 20;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindPackageManagerService.java */
        /* loaded from: classes.dex */
        public static class a implements e {

            /* renamed from: c  reason: collision with root package name */
            public static e f68177c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68178b;

            a(IBinder iBinder) {
                this.f68178b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68178b;
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void deleteUser(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(22, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().deleteUser(i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void doTransferInstalls() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f68178b.transact(29, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().doTransferInstalls();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void doTransferInstallsOnlyForMainPackage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f68178b.transact(30, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().doTransferInstallsOnlyForMainPackage();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ActivityInfo getActivityInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(9, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getActivityInfo(componentName, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ApplicationInfo getApplicationInfo(String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getApplicationInfo(str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ApplicationInfo) ApplicationInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public int getComponentEnabledSetting(ComponentName componentName, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(26, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getComponentEnabledSetting(componentName, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ApplicationInfo> getInstalledApplications(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(11, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getInstalledApplications(i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<PackageInfo> getInstalledPackages(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(12, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getInstalledPackages(i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(PackageInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<InstalledPackage> getInstalledPackagesAsUser(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(24, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getInstalledPackagesAsUser(i4);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledPackage.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public MindPackageSettings getMindPackageSettings(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68178b.transact(27, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getMindPackageSettings(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindPackageSettings.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public PackageInfo getPackageInfo(String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(6, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getPackageInfo(str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PackageInfo) PackageInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public String[] getPackagesForUid(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(31, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getPackagesForUid(i4);
                    }
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ProviderInfo getProviderInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(10, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getProviderInfo(componentName, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ActivityInfo getReceiverInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(8, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getReceiverInfo(componentName, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ServiceInfo getServiceInfo(ComponentName componentName, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(7, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getServiceInfo(componentName, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ServiceInfo) ServiceInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public InstallResult installPackageAsExist(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(19, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().installPackageAsExist(str, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? InstallResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public InstallResult installPackageAsUser(String str, InstallOption installOption, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (installOption != null) {
                        obtain.writeInt(1);
                        installOption.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(18, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().installPackageAsUser(str, installOption, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? InstallResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public boolean isInstalled(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(23, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().isInstalled(str, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ProviderInfo> queryContentProviders(String str, int i4, int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f68178b.transact(17, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryContentProviders(str, i4, i5, i6);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ResolveInfo> queryIntentActivities(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(13, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryIntentActivities(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ResolveInfo> queryIntentBroadcastReceivers(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(15, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryIntentBroadcastReceivers(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(16, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryIntentContentProviders(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public List<ResolveInfo> queryIntentServices(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(14, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryIntentServices(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ResolveInfo resolveActivity(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().resolveActivity(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ProviderInfo resolveContentProvider(String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().resolveContentProvider(str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ResolveInfo resolveIntent(Intent intent, String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().resolveIntent(intent, str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public ResolveInfo resolveService(Intent intent, int i4, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.f68178b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().resolveService(intent, i4, str, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void setComponentEnabledSetting(ComponentName componentName, int i4, int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f68178b.transact(25, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().setComponentEnabledSetting(componentName, i4, i5, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void setMindPackageRunWithPlugin(String str, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f68178b.transact(28, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().setMindPackageRunWithPlugin(str, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void uninstallPackage(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68178b.transact(21, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().uninstallPackage(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.e
            public void uninstallPackageAsUser(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f68178b.transact(20, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().uninstallPackageAsUser(str, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return b.DESCRIPTOR;
            }
        }

        public b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static e getDefaultImpl() {
            return a.f68177c;
        }

        public static boolean setDefaultImpl(e eVar) {
            if (a.f68177c == null) {
                if (eVar != null) {
                    a.f68177c = eVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1598968902) {
                switch (i4) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        ResolveInfo resolveService = resolveService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (resolveService != null) {
                            parcel2.writeInt(1);
                            resolveService.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        ResolveInfo resolveActivity = resolveActivity(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (resolveActivity != null) {
                            parcel2.writeInt(1);
                            resolveActivity.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        ProviderInfo resolveContentProvider = resolveContentProvider(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (resolveContentProvider != null) {
                            parcel2.writeInt(1);
                            resolveContentProvider.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        ResolveInfo resolveIntent = resolveIntent(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (resolveIntent != null) {
                            parcel2.writeInt(1);
                            resolveIntent.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        ApplicationInfo applicationInfo = getApplicationInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (applicationInfo != null) {
                            parcel2.writeInt(1);
                            applicationInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        PackageInfo packageInfo = getPackageInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (packageInfo != null) {
                            parcel2.writeInt(1);
                            packageInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        ServiceInfo serviceInfo = getServiceInfo(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (serviceInfo != null) {
                            parcel2.writeInt(1);
                            serviceInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        ActivityInfo receiverInfo = getReceiverInfo(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (receiverInfo != null) {
                            parcel2.writeInt(1);
                            receiverInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        ActivityInfo activityInfo = getActivityInfo(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (activityInfo != null) {
                            parcel2.writeInt(1);
                            activityInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        ProviderInfo providerInfo = getProviderInfo(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (providerInfo != null) {
                            parcel2.writeInt(1);
                            providerInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ApplicationInfo> installedApplications = getInstalledApplications(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(installedApplications);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<PackageInfo> installedPackages = getInstalledPackages(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(installedPackages);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ResolveInfo> queryIntentActivities = queryIntentActivities(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(queryIntentActivities);
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ResolveInfo> queryIntentServices = queryIntentServices(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(queryIntentServices);
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ResolveInfo> queryIntentBroadcastReceivers = queryIntentBroadcastReceivers(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(queryIntentBroadcastReceivers);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ResolveInfo> queryIntentContentProviders = queryIntentContentProviders(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(queryIntentContentProviders);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ProviderInfo> queryContentProviders = queryContentProviders(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(queryContentProviders);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        InstallResult installPackageAsUser = installPackageAsUser(parcel.readString(), parcel.readInt() != 0 ? InstallOption.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        if (installPackageAsUser != null) {
                            parcel2.writeInt(1);
                            installPackageAsUser.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        InstallResult installPackageAsExist = installPackageAsExist(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (installPackageAsExist != null) {
                            parcel2.writeInt(1);
                            installPackageAsExist.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        uninstallPackageAsUser(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        uninstallPackage(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        deleteUser(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isInstalled = isInstalled(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isInstalled ? 1 : 0);
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<InstalledPackage> installedPackagesAsUser = getInstalledPackagesAsUser(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(installedPackagesAsUser);
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        setComponentEnabledSetting(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        int componentEnabledSetting = getComponentEnabledSetting(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(componentEnabledSetting);
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        MindPackageSettings mindPackageSettings = getMindPackageSettings(parcel.readString());
                        parcel2.writeNoException();
                        if (mindPackageSettings != null) {
                            parcel2.writeInt(1);
                            mindPackageSettings.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        setMindPackageRunWithPlugin(parcel.readString(), parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        doTransferInstalls();
                        parcel2.writeNoException();
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        doTransferInstallsOnlyForMainPackage();
                        parcel2.writeNoException();
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        String[] packagesForUid = getPackagesForUid(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStringArray(packagesForUid);
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void deleteUser(int i4) throws RemoteException;

    void doTransferInstalls() throws RemoteException;

    void doTransferInstallsOnlyForMainPackage() throws RemoteException;

    ActivityInfo getActivityInfo(ComponentName componentName, int i4, int i5) throws RemoteException;

    ApplicationInfo getApplicationInfo(String str, int i4, int i5) throws RemoteException;

    int getComponentEnabledSetting(ComponentName componentName, int i4) throws RemoteException;

    List<ApplicationInfo> getInstalledApplications(int i4, int i5) throws RemoteException;

    List<PackageInfo> getInstalledPackages(int i4, int i5) throws RemoteException;

    List<InstalledPackage> getInstalledPackagesAsUser(int i4) throws RemoteException;

    MindPackageSettings getMindPackageSettings(String str) throws RemoteException;

    PackageInfo getPackageInfo(String str, int i4, int i5) throws RemoteException;

    String[] getPackagesForUid(int i4) throws RemoteException;

    ProviderInfo getProviderInfo(ComponentName componentName, int i4, int i5) throws RemoteException;

    ActivityInfo getReceiverInfo(ComponentName componentName, int i4, int i5) throws RemoteException;

    ServiceInfo getServiceInfo(ComponentName componentName, int i4, int i5) throws RemoteException;

    InstallResult installPackageAsExist(String str, int i4) throws RemoteException;

    InstallResult installPackageAsUser(String str, InstallOption installOption, int i4) throws RemoteException;

    boolean isInstalled(String str, int i4) throws RemoteException;

    List<ProviderInfo> queryContentProviders(String str, int i4, int i5, int i6) throws RemoteException;

    List<ResolveInfo> queryIntentActivities(Intent intent, int i4, String str, int i5) throws RemoteException;

    List<ResolveInfo> queryIntentBroadcastReceivers(Intent intent, int i4, String str, int i5) throws RemoteException;

    List<ResolveInfo> queryIntentContentProviders(Intent intent, int i4, String str, int i5) throws RemoteException;

    List<ResolveInfo> queryIntentServices(Intent intent, int i4, String str, int i5) throws RemoteException;

    ResolveInfo resolveActivity(Intent intent, int i4, String str, int i5) throws RemoteException;

    ProviderInfo resolveContentProvider(String str, int i4, int i5) throws RemoteException;

    ResolveInfo resolveIntent(Intent intent, String str, int i4, int i5) throws RemoteException;

    ResolveInfo resolveService(Intent intent, int i4, String str, int i5) throws RemoteException;

    void setComponentEnabledSetting(ComponentName componentName, int i4, int i5, int i6) throws RemoteException;

    void setMindPackageRunWithPlugin(String str, boolean z4) throws RemoteException;

    void uninstallPackage(String str) throws RemoteException;

    void uninstallPackageAsUser(String str, int i4) throws RemoteException;
}
