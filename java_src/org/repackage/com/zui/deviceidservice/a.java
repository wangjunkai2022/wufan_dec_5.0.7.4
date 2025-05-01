package org.repackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IDeviceidInterface.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* compiled from: IDeviceidInterface.java */
    /* renamed from: org.repackage.com.zui.deviceidservice.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static abstract class AbstractBinderC0803a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        static final int f73068a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f73069b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f73070c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f73071d = 4;

        /* renamed from: e  reason: collision with root package name */
        static final int f73072e = 5;

        /* renamed from: f  reason: collision with root package name */
        static final int f73073f = 6;

        /* renamed from: g  reason: collision with root package name */
        private static final String f73074g = "org.repackage.com.zui.deviceidservice.IDeviceidInterface";

        public AbstractBinderC0803a() {
            attachInterface(this, f73074g);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f73074g);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0804a(iBinder);
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
                        parcel.enforceInterface(f73074g);
                        String a5 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a5);
                        return true;
                    case 2:
                        parcel.enforceInterface(f73074g);
                        String b5 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b5);
                        return true;
                    case 3:
                        parcel.enforceInterface(f73074g);
                        boolean c5 = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c5 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(f73074g);
                        String a6 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a6);
                        return true;
                    case 5:
                        parcel.enforceInterface(f73074g);
                        String b6 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(b6);
                        return true;
                    case 6:
                        parcel.enforceInterface(f73074g);
                        boolean c6 = c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(c6 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(f73074g);
            return true;
        }

        /* compiled from: IDeviceidInterface.java */
        /* renamed from: org.repackage.com.zui.deviceidservice.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        private static class C0804a implements a {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f73075b;

            C0804a(IBinder iBinder) {
                this.f73075b = iBinder;
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    this.f73075b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f73075b;
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    this.f73075b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    this.f73075b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return AbstractBinderC0803a.f73074g;
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    obtain.writeString(str);
                    this.f73075b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    obtain.writeString(str);
                    this.f73075b.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.a
            public boolean c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0803a.f73074g);
                    obtain.writeString(str);
                    this.f73075b.transact(6, obtain, obtain2, 0);
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
