package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface zn extends IInterface {
    long vv(int i4, int i5) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements zn {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.zn$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0640vv implements zn {
            public static zn vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60985m;

            C0640vv(IBinder iBinder) {
                this.f60985m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60985m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.zn
            public long vv(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f60985m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        return vv.vv().vv(i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        public static zn vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            if (queryLocalInterface != null && (queryLocalInterface instanceof zn)) {
                return (zn) queryLocalInterface;
            }
            return new C0640vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            long vv = vv(parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(vv);
            return true;
        }

        public static zn vv() {
            return C0640vv.vv;
        }
    }
}
