package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface o extends IInterface {
    int vv(long j4) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements o {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.o$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0632vv implements o {
            public static o vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60977m;

            C0632vv(IBinder iBinder) {
                this.f60977m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60977m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.o
            public int vv(long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j4);
                    if (!this.f60977m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        return vv.vv().vv(j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        public static o vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            if (queryLocalInterface != null && (queryLocalInterface instanceof o)) {
                return (o) queryLocalInterface;
            }
            return new C0632vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
            int vv = vv(parcel.readLong());
            parcel2.writeNoException();
            parcel2.writeInt(vv);
            return true;
        }

        public static o vv() {
            return C0632vv.vv;
        }
    }
}
