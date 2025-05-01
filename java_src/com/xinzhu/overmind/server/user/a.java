package com.xinzhu.overmind.server.user;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: IMindUserManagerService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IMindUserManagerService.java */
    /* renamed from: com.xinzhu.overmind.server.user.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0759a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.user.a
        public MindUserInfo createUser(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.user.a
        public void deleteUser(int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.user.a
        public boolean exists(int i4) throws RemoteException {
            return false;
        }

        @Override // com.xinzhu.overmind.server.user.a
        public MindUserInfo getUserInfo(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.user.a
        public List<MindUserInfo> getUsers() throws RemoteException {
            return null;
        }
    }

    /* compiled from: IMindUserManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.user.IMindUserManagerService";
        static final int TRANSACTION_createUser = 3;
        static final int TRANSACTION_deleteUser = 5;
        static final int TRANSACTION_exists = 2;
        static final int TRANSACTION_getUserInfo = 1;
        static final int TRANSACTION_getUsers = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindUserManagerService.java */
        /* renamed from: com.xinzhu.overmind.server.user.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0760a implements a {

            /* renamed from: c  reason: collision with root package name */
            public static a f68259c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68260b;

            C0760a(IBinder iBinder) {
                this.f68260b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68260b;
            }

            @Override // com.xinzhu.overmind.server.user.a
            public MindUserInfo createUser(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68260b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().createUser(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindUserInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.user.a
            public void deleteUser(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68260b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().deleteUser(i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.user.a
            public boolean exists(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68260b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().exists(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.user.a
            public MindUserInfo getUserInfo(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f68260b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getUserInfo(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindUserInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.user.a
            public List<MindUserInfo> getUsers() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f68260b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getUsers();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MindUserInfo.CREATOR);
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
            return new C0760a(iBinder);
        }

        public static a getDefaultImpl() {
            return C0760a.f68259c;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0760a.f68259c == null) {
                if (aVar != null) {
                    C0760a.f68259c = aVar;
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
                MindUserInfo userInfo = getUserInfo(parcel.readInt());
                parcel2.writeNoException();
                if (userInfo != null) {
                    parcel2.writeInt(1);
                    userInfo.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean exists = exists(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(exists ? 1 : 0);
                return true;
            } else if (i4 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                MindUserInfo createUser = createUser(parcel.readInt());
                parcel2.writeNoException();
                if (createUser != null) {
                    parcel2.writeInt(1);
                    createUser.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i4 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                List<MindUserInfo> users = getUsers();
                parcel2.writeNoException();
                parcel2.writeTypedList(users);
                return true;
            } else if (i4 != 5) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                deleteUser(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
        }
    }

    MindUserInfo createUser(int i4) throws RemoteException;

    void deleteUser(int i4) throws RemoteException;

    boolean exists(int i4) throws RemoteException;

    MindUserInfo getUserInfo(int i4) throws RemoteException;

    List<MindUserInfo> getUsers() throws RemoteException;
}
