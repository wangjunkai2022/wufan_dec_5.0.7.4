package com.ss.android.socialbase.downloader.m;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes5.dex */
public interface m extends IInterface {
    void vv(Map map, Map map2) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements m {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.m.m$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0645vv implements m {
            public static m vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f61134m;

            C0645vv(IBinder iBinder) {
                this.f61134m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f61134m;
            }

            @Override // com.ss.android.socialbase.downloader.m.m
            public void vv(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (!this.f61134m.transact(1, obtain, obtain2, 0) && vv.vv() != null) {
                        vv.vv().vv(map, map2);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        public static m vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            if (queryLocalInterface != null && (queryLocalInterface instanceof m)) {
                return (m) queryLocalInterface;
            }
            return new C0645vv(iBinder);
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
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            ClassLoader classLoader = getClass().getClassLoader();
            vv(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
            parcel2.writeNoException();
            return true;
        }

        public static m vv() {
            return C0645vv.vv;
        }
    }
}
