package com.xinzhu.overmind.server.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xinzhu.overmind.entity.pm.InstalledModule;
import java.util.List;
/* compiled from: IMindXposedManagerService.java */
/* loaded from: classes6.dex */
public interface f extends IInterface {

    /* compiled from: IMindXposedManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements f {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.f
        public boolean f(String str) throws RemoteException {
            return false;
        }

        @Override // com.xinzhu.overmind.server.pm.f
        public boolean j() throws RemoteException {
            return false;
        }

        @Override // com.xinzhu.overmind.server.pm.f
        public List<InstalledModule> q() throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.pm.f
        public void r(String str, boolean z4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.pm.f
        public void s(boolean z4) throws RemoteException {
        }
    }

    /* compiled from: IMindXposedManagerService.java */
    /* loaded from: classes6.dex */
    public static abstract class b extends Binder implements f {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.pm.IMindXposedManagerService";
        static final int TRANSACTION_getInstalledModules = 5;
        static final int TRANSACTION_isModuleEnable = 3;
        static final int TRANSACTION_isXPEnable = 1;
        static final int TRANSACTION_setModuleEnable = 4;
        static final int TRANSACTION_setXPEnable = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindXposedManagerService.java */
        /* loaded from: classes6.dex */
        public static class a implements f {

            /* renamed from: c  reason: collision with root package name */
            public static f f68179c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68180b;

            a(IBinder iBinder) {
                this.f68180b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68180b;
            }

            @Override // com.xinzhu.overmind.server.pm.f
            public boolean f(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68180b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().f(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.f
            public boolean j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f68180b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().j();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.f
            public List<InstalledModule> q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f68180b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().q();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledModule.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.f
            public void r(String str, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f68180b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().r(str, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.pm.f
            public void s(boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!this.f68180b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().s(z4);
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

        public static f asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                return (f) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static f getDefaultImpl() {
            return a.f68179c;
        }

        public static boolean setDefaultImpl(f fVar) {
            if (a.f68179c == null) {
                if (fVar != null) {
                    a.f68179c = fVar;
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
                boolean j4 = j();
                parcel2.writeNoException();
                parcel2.writeInt(j4 ? 1 : 0);
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                s(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i4 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean f5 = f(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(f5 ? 1 : 0);
                return true;
            } else if (i4 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                r(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i4 != 5) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                List<InstalledModule> q4 = q();
                parcel2.writeNoException();
                parcel2.writeTypedList(q4);
                return true;
            }
        }
    }

    boolean f(String str) throws RemoteException;

    boolean j() throws RemoteException;

    List<InstalledModule> q() throws RemoteException;

    void r(String str, boolean z4) throws RemoteException;

    void s(boolean z4) throws RemoteException;
}
