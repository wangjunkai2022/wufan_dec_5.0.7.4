package com.xinzhu.overmind.server.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMindNotificationManagerService.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* compiled from: IMindNotificationManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.c
        public String solveAddNotification(String str, int i4, int i5, String str2) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.c
        public void solveCancelAllNotifications(String str, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.os.c
        public String solveCancelNotification(String str, int i4, int i5, String str2) throws RemoteException {
            return null;
        }
    }

    /* compiled from: IMindNotificationManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements c {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.os.IMindNotificationManagerService";
        static final int TRANSACTION_solveAddNotification = 1;
        static final int TRANSACTION_solveCancelAllNotifications = 3;
        static final int TRANSACTION_solveCancelNotification = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindNotificationManagerService.java */
        /* loaded from: classes.dex */
        public static class a implements c {

            /* renamed from: c  reason: collision with root package name */
            public static c f68024c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68025b;

            a(IBinder iBinder) {
                this.f68025b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68025b;
            }

            @Override // com.xinzhu.overmind.server.os.c
            public String solveAddNotification(String str, int i4, int i5, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (!this.f68025b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().solveAddNotification(str, i4, i5, str2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.c
            public void solveCancelAllNotifications(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f68025b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().solveCancelAllNotifications(str, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.c
            public String solveCancelNotification(String str, int i4, int i5, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (!this.f68025b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().solveCancelNotification(str, i4, i5, str2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
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

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static c getDefaultImpl() {
            return a.f68024c;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (a.f68024c == null) {
                if (cVar != null) {
                    a.f68024c = cVar;
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
                String solveAddNotification = solveAddNotification(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(solveAddNotification);
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                String solveCancelNotification = solveCancelNotification(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(solveCancelNotification);
                return true;
            } else if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                solveCancelAllNotifications(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
        }
    }

    String solveAddNotification(String str, int i4, int i5, String str2) throws RemoteException;

    void solveCancelAllNotifications(String str, int i4) throws RemoteException;

    String solveCancelNotification(String str, int i4, int i5, String str2) throws RemoteException;
}
