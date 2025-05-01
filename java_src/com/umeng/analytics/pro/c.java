package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.umeng.analytics.pro.b;
/* compiled from: IOAIDService.java */
/* loaded from: classes6.dex */
public interface c extends IInterface {

    /* compiled from: IOAIDService.java */
    /* loaded from: classes6.dex */
    public static class a implements c {
        @Override // com.umeng.analytics.pro.c
        public void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException {
        }

        @Override // com.umeng.analytics.pro.c
        public void a(com.umeng.analytics.pro.b bVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.c
        public void b(com.umeng.analytics.pro.b bVar) throws RemoteException {
        }
    }

    void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException;

    void a(com.umeng.analytics.pro.b bVar) throws RemoteException;

    void b(com.umeng.analytics.pro.b bVar) throws RemoteException;

    /* compiled from: IOAIDService.java */
    /* loaded from: classes6.dex */
    public static abstract class b extends Binder implements c {

        /* renamed from: a  reason: collision with root package name */
        static final int f63549a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f63550b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f63551c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final String f63552d = "com.hihonor.cloudservice.oaid.IOAIDService";

        public b() {
            attachInterface(this, f63552d);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f63552d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(f63552d);
                a(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(f63552d);
                a(b.AbstractBinderC0667b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(f63552d);
                return true;
            } else {
                parcel.enforceInterface(f63552d);
                b(b.AbstractBinderC0667b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }

        public static boolean a(c cVar) {
            if (a.f63553a != null || cVar == null) {
                return false;
            }
            a.f63553a = cVar;
            return true;
        }

        public static c a() {
            return a.f63553a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IOAIDService.java */
        /* loaded from: classes6.dex */
        public static class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static c f63553a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f63554b;

            a(IBinder iBinder) {
                this.f63554b = iBinder;
            }

            public String a() {
                return b.f63552d;
            }

            @Override // com.umeng.analytics.pro.c
            public void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63552d);
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeFloat(f5);
                    obtain.writeDouble(d5);
                    obtain.writeString(str);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.f63554b.transact(1, obtain, obtain2, 0) && b.a() != null) {
                        b.a().a(i4, j4, z4, f5, d5, str);
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f63554b;
            }

            @Override // com.umeng.analytics.pro.c
            public void b(com.umeng.analytics.pro.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63552d);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f63554b.transact(3, obtain, obtain2, 0) && b.a() != null) {
                        b.a().b(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.c
            public void a(com.umeng.analytics.pro.b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f63552d);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f63554b.transact(2, obtain, obtain2, 0) && b.a() != null) {
                        b.a().a(bVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
