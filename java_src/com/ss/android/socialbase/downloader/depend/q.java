package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface q extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements q {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.q$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0633vv implements q {
            public static q vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60978m;

            C0633vv(IBinder iBinder) {
                this.f60978m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60978m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.q
            public void vv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (!this.f60978m.transact(1, obtain, obtain2, 0) && vv.m() != null) {
                        vv.m().vv();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        public static q m() {
            return C0633vv.vv;
        }

        public static q vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof q)) {
                return (q) queryLocalInterface;
            }
            return new C0633vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            vv();
            parcel2.writeNoException();
            return true;
        }
    }

    void vv() throws RemoteException;
}
