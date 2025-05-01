package com.xinzhu.overmind.server.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.List;
/* compiled from: IMindFileShareService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: IMindFileShareService.java */
    /* loaded from: classes6.dex */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.b
        public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.os.b
        public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
            return null;
        }
    }

    /* compiled from: IMindFileShareService.java */
    /* renamed from: com.xinzhu.overmind.server.os.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0757b extends Binder implements b {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.os.IMindFileShareService";
        static final int TRANSACTION_listFiles = 1;
        static final int TRANSACTION_openAsParcelFile = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindFileShareService.java */
        /* renamed from: com.xinzhu.overmind.server.os.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements b {

            /* renamed from: c  reason: collision with root package name */
            public static b f68022c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f68023b;

            a(IBinder iBinder) {
                this.f68023b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68023b;
            }

            @Override // com.xinzhu.overmind.server.os.b
            public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0757b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68023b.transact(1, obtain, obtain2, 0) && AbstractBinderC0757b.getDefaultImpl() != null) {
                        return AbstractBinderC0757b.getDefaultImpl().listFiles(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MindShareFileInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.os.b
            public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0757b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f68023b.transact(2, obtain, obtain2, 0) && AbstractBinderC0757b.getDefaultImpl() != null) {
                        return AbstractBinderC0757b.getDefaultImpl().openAsParcelFile(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return AbstractBinderC0757b.DESCRIPTOR;
            }
        }

        public AbstractBinderC0757b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static b getDefaultImpl() {
            return a.f68022c;
        }

        public static boolean setDefaultImpl(b bVar) {
            if (a.f68022c == null) {
                if (bVar != null) {
                    a.f68022c = bVar;
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
                List<MindShareFileInfo> listFiles = listFiles(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listFiles);
                return true;
            } else if (i4 != 2) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
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
            }
        }
    }

    List<MindShareFileInfo> listFiles(String str) throws RemoteException;

    ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException;
}
