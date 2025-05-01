package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IDeviceIdManager.java */
/* loaded from: classes6.dex */
public interface a extends IInterface {

    /* compiled from: IDeviceIdManager.java */
    /* renamed from: com.umeng.analytics.pro.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0665a implements a {
        @Override // com.umeng.analytics.pro.a
        public String a(String str) throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public boolean a() throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String b() throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String b(String str) throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String c(String str) throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String d(String str) throws RemoteException {
            return null;
        }

        @Override // com.umeng.analytics.pro.a
        public String e(String str) throws RemoteException {
            return null;
        }
    }

    String a(String str) throws RemoteException;

    boolean a() throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    String c(String str) throws RemoteException;

    String d(String str) throws RemoteException;

    String e(String str) throws RemoteException;

    /* compiled from: IDeviceIdManager.java */
    /* loaded from: classes6.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        static final int f63277a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f63278b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f63279c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f63280d = 4;

        /* renamed from: e  reason: collision with root package name */
        static final int f63281e = 5;

        /* renamed from: f  reason: collision with root package name */
        static final int f63282f = 6;

        /* renamed from: g  reason: collision with root package name */
        static final int f63283g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final String f63284h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        public b() {
            attachInterface(this, f63284h);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f63284h);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0666a(iBinder);
        }

        public static a c() {
            return C0666a.f63285a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1598968902) {
                switch (i4) {
                    case 1:
                        parcel.enforceInterface(f63284h);
                        String a5 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a5);
                        return true;
                    case 2:
                        parcel.enforceInterface(f63284h);
                        String b5 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(b5);
                        return true;
                    case 3:
                        parcel.enforceInterface(f63284h);
                        String c5 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(c5);
                        return true;
                    case 4:
                        parcel.enforceInterface(f63284h);
                        String d5 = d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(d5);
                        return true;
                    case 5:
                        parcel.enforceInterface(f63284h);
                        String e5 = e(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(e5);
                        return true;
                    case 6:
                        parcel.enforceInterface(f63284h);
                        boolean a6 = a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a6 ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(f63284h);
                        String b6 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b6);
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(f63284h);
            return true;
        }

        public static boolean a(a aVar) {
            if (C0666a.f63285a != null || aVar == null) {
                return false;
            }
            C0666a.f63285a = aVar;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IDeviceIdManager.java */
        /* renamed from: com.umeng.analytics.pro.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C0666a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f63285a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f63286b;

            C0666a(IBinder iBinder) {
                this.f63286b = iBinder;
            }

            @Override // com.umeng.analytics.pro.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    obtain.writeString(str);
                    if (!this.f63286b.transact(1, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().a(str);
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
                return this.f63286b;
            }

            @Override // com.umeng.analytics.pro.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    obtain.writeString(str);
                    if (!this.f63286b.transact(2, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return b.f63284h;
            }

            @Override // com.umeng.analytics.pro.a
            public String c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    obtain.writeString(str);
                    if (!this.f63286b.transact(3, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().c(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.a
            public String d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    obtain.writeString(str);
                    if (!this.f63286b.transact(4, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().d(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.a
            public String e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    obtain.writeString(str);
                    if (!this.f63286b.transact(5, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().e(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.a
            public boolean a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    if (!this.f63286b.transact(6, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().a();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63284h);
                    if (!this.f63286b.transact(7, obtain, obtain2, 0) && b.c() != null) {
                        return b.c().b();
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
