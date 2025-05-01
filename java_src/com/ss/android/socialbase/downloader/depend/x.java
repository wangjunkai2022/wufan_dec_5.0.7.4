package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes5.dex */
public interface x extends IInterface {
    void vv(List<String> list) throws RemoteException;

    boolean vv() throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements x {
        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
        }

        public static x m() {
            return C0638vv.vv;
        }

        public static x vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof x)) {
                return (x) queryLocalInterface;
            }
            return new C0638vv(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                vv(parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            } else if (i4 != 2) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                return true;
            } else {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                boolean vv = vv();
                parcel2.writeNoException();
                parcel2.writeInt(vv ? 1 : 0);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.x$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0638vv implements x {
            public static x vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60983m;

            C0638vv(IBinder iBinder) {
                this.f60983m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60983m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public void vv(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    obtain.writeStringList(list);
                    if (!this.f60983m.transact(1, obtain, obtain2, 0) && vv.m() != null) {
                        vv.m().vv(list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public boolean vv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    if (!this.f60983m.transact(2, obtain, obtain2, 0) && vv.m() != null) {
                        return vv.m().vv();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
