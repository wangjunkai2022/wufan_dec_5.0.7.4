package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.q;
/* loaded from: classes5.dex */
public interface j extends IInterface {
    boolean vv(long j4, long j5, q qVar) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements j {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.j$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0627vv implements j {
            public static j vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60972m;

            C0627vv(IBinder iBinder) {
                this.f60972m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60972m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public boolean vv(long j4, long j5, q qVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j4);
                    obtain.writeLong(j5);
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    if (!this.f60972m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        return vv.vv().vv(j4, j5, qVar);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        public static j vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                return (j) queryLocalInterface;
            }
            return new C0627vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            boolean vv = vv(parcel.readLong(), parcel.readLong(), q.vv.vv(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(vv ? 1 : 0);
            return true;
        }

        public static j vv() {
            return C0627vv.vv;
        }
    }
}
