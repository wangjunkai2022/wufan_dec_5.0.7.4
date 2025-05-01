package com.xinzhu.overmind.server.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMindDeviceInfoService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IMindDeviceInfoService.java */
    /* renamed from: com.xinzhu.overmind.server.os.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0755a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.a
        public MindDeviceInfo getDeviceInfo(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.a
        public void setVirtualDeviceStatus(boolean z4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.os.a
        public void updateMindDeviceInfo(int i4, MindDeviceInfo mindDeviceInfo) throws RemoteException {
        }
    }

    /* compiled from: IMindDeviceInfoService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.os.IMindDeviceInfoService";
        static final int TRANSACTION_getDeviceInfo = 1;
        static final int TRANSACTION_setVirtualDeviceStatus = 2;
        static final int TRANSACTION_updateMindDeviceInfo = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindDeviceInfoService.java */
        /* renamed from: com.xinzhu.overmind.server.os.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0756a implements a {

            /* renamed from: c  reason: collision with root package name */
            public static a f68020c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68021b;

            C0756a(IBinder iBinder) {
                this.f68021b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68021b;
            }

            @Override // com.xinzhu.overmind.server.os.a
            public MindDeviceInfo getDeviceInfo(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68021b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getDeviceInfo(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindDeviceInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.a
            public void setVirtualDeviceStatus(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f68021b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().setVirtualDeviceStatus(z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.a
            public void updateMindDeviceInfo(int i4, MindDeviceInfo mindDeviceInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (mindDeviceInfo != null) {
                        obtain.writeInt(1);
                        mindDeviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f68021b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().updateMindDeviceInfo(i4, mindDeviceInfo);
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
            return new C0756a(iBinder);
        }

        public static a getDefaultImpl() {
            return C0756a.f68020c;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0756a.f68020c == null) {
                if (aVar != null) {
                    C0756a.f68020c = aVar;
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
                MindDeviceInfo deviceInfo = getDeviceInfo(parcel.readInt());
                parcel2.writeNoException();
                if (deviceInfo != null) {
                    parcel2.writeInt(1);
                    deviceInfo.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                setVirtualDeviceStatus(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                updateMindDeviceInfo(parcel.readInt(), parcel.readInt() != 0 ? MindDeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
        }
    }

    MindDeviceInfo getDeviceInfo(int i4) throws RemoteException;

    void setVirtualDeviceStatus(boolean z4) throws RemoteException;

    void updateMindDeviceInfo(int i4, MindDeviceInfo mindDeviceInfo) throws RemoteException;
}
