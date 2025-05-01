package com.xinzhu.overmind.plugin;

import android.app.ActivityManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import java.util.List;
/* compiled from: IPluginMonitor.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IPluginMonitor.java */
    /* renamed from: com.xinzhu.overmind.plugin.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0748a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public MindShareFileInfo checkFile(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void copyDir(String str, String str2) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void copyFile(String str, String str2) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deleteAllPackages() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deleteFileOrDir(String str) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deletePackage(String str, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void finishPlugin() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public int initWorks() throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void killProcess(int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void syncAllPackages() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void syncPackage(String str, int i4) throws RemoteException {
        }
    }

    /* compiled from: IPluginMonitor.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.plugin.IPluginMonitor";
        static final int TRANSACTION_checkFile = 11;
        static final int TRANSACTION_copyDir = 13;
        static final int TRANSACTION_copyFile = 12;
        static final int TRANSACTION_deleteAllPackages = 5;
        static final int TRANSACTION_deleteFileOrDir = 14;
        static final int TRANSACTION_deletePackage = 6;
        static final int TRANSACTION_finishPlugin = 2;
        static final int TRANSACTION_getRecentTasks = 8;
        static final int TRANSACTION_getRunningAppProcesses = 7;
        static final int TRANSACTION_initWorks = 1;
        static final int TRANSACTION_killProcess = 9;
        static final int TRANSACTION_listFiles = 10;
        static final int TRANSACTION_openAsParcelFile = 15;
        static final int TRANSACTION_syncAllPackages = 3;
        static final int TRANSACTION_syncPackage = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IPluginMonitor.java */
        /* renamed from: com.xinzhu.overmind.plugin.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0749a implements a {

            /* renamed from: c  reason: collision with root package name */
            public static a f67828c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67829b;

            C0749a(IBinder iBinder) {
                this.f67829b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67829b;
            }

            @Override // com.xinzhu.overmind.plugin.a
            public MindShareFileInfo checkFile(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f67829b.transact(11, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().checkFile(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindShareFileInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void copyDir(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f67829b.transact(13, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().copyDir(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void copyFile(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f67829b.transact(12, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().copyFile(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void deleteAllPackages() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67829b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().deleteAllPackages();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void deleteFileOrDir(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f67829b.transact(14, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().deleteFileOrDir(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void deletePackage(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67829b.transact(6, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().deletePackage(str, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void finishPlugin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67829b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().finishPlugin();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67829b.transact(8, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getRecentTasks(i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67829b.transact(7, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getRunningAppProcesses();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public int initWorks() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67829b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().initWorks();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void killProcess(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f67829b.transact(9, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().killProcess(i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f67829b.transact(10, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().listFiles(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MindShareFileInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f67829b.transact(15, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().openAsParcelFile(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void syncAllPackages() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67829b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().syncAllPackages();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.plugin.a
            public void syncPackage(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67829b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().syncPackage(str, i4);
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

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0749a(iBinder);
        }

        public static a getDefaultImpl() {
            return C0749a.f67828c;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0749a.f67828c == null) {
                if (aVar != null) {
                    C0749a.f67828c = aVar;
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
                        int initWorks = initWorks();
                        parcel2.writeNoException();
                        parcel2.writeInt(initWorks);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        finishPlugin();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        syncAllPackages();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        syncPackage(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        deleteAllPackages();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        deletePackage(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = getRunningAppProcesses();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(runningAppProcesses);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RecentTaskInfo> recentTasks = getRecentTasks(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(recentTasks);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        killProcess(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<MindShareFileInfo> listFiles = listFiles(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(listFiles);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        MindShareFileInfo checkFile = checkFile(parcel.readString());
                        parcel2.writeNoException();
                        if (checkFile != null) {
                            parcel2.writeInt(1);
                            checkFile.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        copyFile(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        copyDir(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        deleteFileOrDir(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        ParcelFileDescriptor openAsParcelFile = openAsParcelFile(parcel.readString());
                        parcel2.writeNoException();
                        if (openAsParcelFile != null) {
                            parcel2.writeInt(1);
                            openAsParcelFile.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    MindShareFileInfo checkFile(String str) throws RemoteException;

    void copyDir(String str, String str2) throws RemoteException;

    void copyFile(String str, String str2) throws RemoteException;

    void deleteAllPackages() throws RemoteException;

    void deleteFileOrDir(String str) throws RemoteException;

    void deletePackage(String str, int i4) throws RemoteException;

    void finishPlugin() throws RemoteException;

    List<ActivityManager.RecentTaskInfo> getRecentTasks(int i4, int i5) throws RemoteException;

    List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException;

    int initWorks() throws RemoteException;

    void killProcess(int i4) throws RemoteException;

    List<MindShareFileInfo> listFiles(String str) throws RemoteException;

    ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException;

    void syncAllPackages() throws RemoteException;

    void syncPackage(String str, int i4) throws RemoteException;
}
