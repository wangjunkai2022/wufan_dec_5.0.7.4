package com.ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface n extends IInterface {
    Uri vv(String str, String str2) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements n {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.n$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0630vv implements n {
            public static n vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60975m;

            C0630vv(IBinder iBinder) {
                this.f60975m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60975m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.n
            public Uri vv(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f60975m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        return vv.vv().vv(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        }

        public static n vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            if (queryLocalInterface != null && (queryLocalInterface instanceof n)) {
                return (n) queryLocalInterface;
            }
            return new C0630vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            Uri vv = vv(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            if (vv != null) {
                parcel2.writeInt(1);
                vv.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        public static n vv() {
            return C0630vv.vv;
        }
    }
}
