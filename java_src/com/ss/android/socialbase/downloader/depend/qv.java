package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface qv extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements qv {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.qv$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0634vv implements qv {
            public static qv vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60979m;

            C0634vv(IBinder iBinder) {
                this.f60979m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60979m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.qv
            public boolean vv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    if (!this.f60979m.transact(1, obtain, obtain2, 0) && vv.m() != null) {
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

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        public static qv m() {
            return C0634vv.vv;
        }

        public static qv vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            if (queryLocalInterface != null && (queryLocalInterface instanceof qv)) {
                return (qv) queryLocalInterface;
            }
            return new C0634vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            boolean vv = vv();
            parcel2.writeNoException();
            parcel2.writeInt(vv ? 1 : 0);
            return true;
        }
    }

    boolean vv() throws RemoteException;
}
