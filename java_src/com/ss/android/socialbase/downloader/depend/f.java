package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface f extends IInterface {
    void vv(int i4, int i5) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements f {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.depend.f$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0626vv implements f {
            public static f vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f60971m;

            C0626vv(IBinder iBinder) {
                this.f60971m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60971m;
            }

            @Override // com.ss.android.socialbase.downloader.depend.f
            public void vv(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f60971m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        vv.vv().vv(i4, i5);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        public static f vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                return (f) queryLocalInterface;
            }
            return new C0626vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            vv(parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public static f vv() {
            return C0626vv.vv;
        }
    }
}
