package com.bda.controller;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IControllerMonitor.java */
/* loaded from: classes2.dex */
public interface e extends IInterface {

    /* compiled from: IControllerMonitor.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements e {
        private static final String DESCRIPTOR = "com.bda.controller.IControllerMonitor";
        static final int TRANSACTION_onLog = 1;

        /* compiled from: IControllerMonitor.java */
        /* renamed from: com.bda.controller.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0164a implements e {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f5145b;

            C0164a(IBinder iBinder) {
                this.f5145b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5145b;
            }

            @Override // com.bda.controller.e
            public void onLog(int i4, int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    this.f5145b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return a.DESCRIPTOR;
            }
        }

        public a() {
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
            return new C0164a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onLog(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onLog(int i4, int i5, String str) throws RemoteException;
}
