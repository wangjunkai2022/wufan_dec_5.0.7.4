package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.x;
/* loaded from: classes5.dex */
public interface y extends IInterface {
    boolean vv(x xVar) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements y {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.y$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0639vv implements y {
            public static y vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60984m;

            C0639vv(IBinder iBinder) {
                this.f60984m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60984m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public boolean vv(x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    if (!this.f60984m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        return vv.vv().vv(xVar);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        public static y vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                return (y) queryLocalInterface;
            }
            return new C0639vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            boolean vv = vv(x.vv.vv(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(vv ? 1 : 0);
            return true;
        }

        public static y vv() {
            return C0639vv.vv;
        }
    }
}
