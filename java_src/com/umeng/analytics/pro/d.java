package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IDeviceIdService.java */
/* loaded from: classes6.dex */
public interface d extends IInterface {

    /* compiled from: IDeviceIdService.java */
    /* loaded from: classes6.dex */
    public static class a implements d {
        @Override // com.umeng.analytics.pro.d
        public String a() throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.d
        public String a(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.d
        public String b(String str) throws RemoteException {
            return null;
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* compiled from: IDeviceIdService.java */
    /* loaded from: classes6.dex */
    public static abstract class b extends Binder implements d {

        /* renamed from: a  reason: collision with root package name */
        static final int f63655a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f63656b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f63657c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final String f63658d = "com.samsung.android.deviceidservice.IDeviceIdService";

        public b() {
            attachInterface(this, f63658d);
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f63658d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static d b() {
            return a.f63659a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(f63658d);
                String a5 = a();
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(f63658d);
                String a6 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a6);
                return true;
            } else if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(f63658d);
                return true;
            } else {
                parcel.enforceInterface(f63658d);
                String b5 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b5);
                return true;
            }
        }

        public static boolean a(d dVar) {
            if (a.f63659a != null || dVar == null) {
                return false;
            }
            a.f63659a = dVar;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IDeviceIdService.java */
        /* loaded from: classes6.dex */
        public static class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public static d f63659a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f63660b;

            a(IBinder iBinder) {
                this.f63660b = iBinder;
            }

            @Override // com.umeng.analytics.pro.d
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63658d);
                    if (!this.f63660b.transact(1, obtain, obtain2, 0) && b.b() != null) {
                        return b.b().a();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f63660b;
            }

            public String b() {
                return b.f63658d;
            }

            @Override // com.umeng.analytics.pro.d
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63658d);
                    obtain.writeString(str);
                    if (!this.f63660b.transact(3, obtain, obtain2, 0) && b.b() != null) {
                        return b.b().b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.d
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63658d);
                    obtain.writeString(str);
                    if (!this.f63660b.transact(2, obtain, obtain2, 0) && b.b() != null) {
                        return b.b().a(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
