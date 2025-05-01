package com.xinzhu.overmind.server.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMindPackageInstallerService.java */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* compiled from: IMindPackageInstallerService.java */
    /* loaded from: classes6.dex */
    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.d
        public int installPackageAsExist(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.pm.d
        public int installPackageAsUser(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.pm.d
        public int uninstallPackageAsUser(MindPackageSettings mindPackageSettings, boolean z4, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.pm.d
        public int updatePackage(MindPackageSettings mindPackageSettings) throws RemoteException {
            return 0;
        }
    }

    /* compiled from: IMindPackageInstallerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements d {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.pm.IMindPackageInstallerService";
        static final int TRANSACTION_installPackageAsExist = 2;
        static final int TRANSACTION_installPackageAsUser = 1;
        static final int TRANSACTION_uninstallPackageAsUser = 3;
        static final int TRANSACTION_updatePackage = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindPackageInstallerService.java */
        /* loaded from: classes6.dex */
        public static class a implements d {

            /* renamed from: c  reason: collision with root package name */
            public static d f68175c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68176b;

            a(IBinder iBinder) {
                this.f68176b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68176b;
            }

            @Override // com.xinzhu.overmind.server.pm.d
            public int installPackageAsExist(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (mindPackageSettings != null) {
                        obtain.writeInt(1);
                        mindPackageSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f68176b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().installPackageAsExist(mindPackageSettings, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.d
            public int installPackageAsUser(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (mindPackageSettings != null) {
                        obtain.writeInt(1);
                        mindPackageSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f68176b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().installPackageAsUser(mindPackageSettings, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.d
            public int uninstallPackageAsUser(MindPackageSettings mindPackageSettings, boolean z4, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    int i5 = 1;
                    if (mindPackageSettings != null) {
                        obtain.writeInt(1);
                        mindPackageSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z4) {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    obtain.writeInt(i4);
                    if (!this.f68176b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().uninstallPackageAsUser(mindPackageSettings, z4, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.d
            public int updatePackage(MindPackageSettings mindPackageSettings) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (mindPackageSettings != null) {
                        obtain.writeInt(1);
                        mindPackageSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f68176b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().updatePackage(mindPackageSettings);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
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

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static d getDefaultImpl() {
            return a.f68175c;
        }

        public static boolean setDefaultImpl(d dVar) {
            if (a.f68175c == null) {
                if (dVar != null) {
                    a.f68175c = dVar;
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
            if (i4 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int installPackageAsUser = installPackageAsUser(parcel.readInt() != 0 ? MindPackageSettings.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(installPackageAsUser);
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int installPackageAsExist = installPackageAsExist(parcel.readInt() != 0 ? MindPackageSettings.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(installPackageAsExist);
                return true;
            } else if (i4 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                int uninstallPackageAsUser = uninstallPackageAsUser(parcel.readInt() != 0 ? MindPackageSettings.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(uninstallPackageAsUser);
                return true;
            } else if (i4 != 4) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                int updatePackage = updatePackage(parcel.readInt() != 0 ? MindPackageSettings.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(updatePackage);
                return true;
            }
        }
    }

    int installPackageAsExist(MindPackageSettings mindPackageSettings, int i4) throws RemoteException;

    int installPackageAsUser(MindPackageSettings mindPackageSettings, int i4) throws RemoteException;

    int uninstallPackageAsUser(MindPackageSettings mindPackageSettings, boolean z4, int i4) throws RemoteException;

    int updatePackage(MindPackageSettings mindPackageSettings) throws RemoteException;
}
