package com.xinzhu.overmind.server.os;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.storage.StorageVolume;
/* compiled from: IMindStorageManagerService.java */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* compiled from: IMindStorageManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.d
        public Uri getUriForFile(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.d
        public StorageVolume[] getVolumeList(int i4, String str, int i5, int i6) throws RemoteException {
            return null;
        }
    }

    /* compiled from: IMindStorageManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements d {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.os.IMindStorageManagerService";
        static final int TRANSACTION_getUriForFile = 2;
        static final int TRANSACTION_getVolumeList = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindStorageManagerService.java */
        /* loaded from: classes.dex */
        public static class a implements d {

            /* renamed from: c  reason: collision with root package name */
            public static d f68026c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68027b;

            a(IBinder iBinder) {
                this.f68027b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68027b;
            }

            @Override // com.xinzhu.overmind.server.os.d
            public Uri getUriForFile(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68027b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getUriForFile(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.d
            public StorageVolume[] getVolumeList(int i4, String str, int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.f68027b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getVolumeList(i4, str, i5, i6);
                    }
                    obtain2.readException();
                    return (StorageVolume[]) obtain2.createTypedArray(StorageVolume.CREATOR);
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
            return a.f68026c;
        }

        public static boolean setDefaultImpl(d dVar) {
            if (a.f68026c == null) {
                if (dVar != null) {
                    a.f68026c = dVar;
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
                StorageVolume[] volumeList = getVolumeList(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(volumeList, 1);
                return true;
            } else if (i4 != 2) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                Uri uriForFile = getUriForFile(parcel.readString());
                parcel2.writeNoException();
                if (uriForFile != null) {
                    parcel2.writeInt(1);
                    uriForFile.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }
    }

    Uri getUriForFile(String str) throws RemoteException;

    StorageVolume[] getVolumeList(int i4, String str, int i5, int i6) throws RemoteException;
}
