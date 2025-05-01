package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IOAIDCallBack.java */
/* loaded from: classes6.dex */
public interface b extends IInterface {

    /* compiled from: IOAIDCallBack.java */
    /* loaded from: classes6.dex */
    public static class a implements b {
        @Override // com.umeng.analytics.pro.b
        public void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException {
        }

        @Override // com.umeng.analytics.pro.b
        public void a(int i4, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException;

    void a(int i4, Bundle bundle) throws RemoteException;

    /* compiled from: IOAIDCallBack.java */
    /* renamed from: com.umeng.analytics.pro.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBinderC0667b extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        static final int f63412a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f63413b = 2;

        /* renamed from: c  reason: collision with root package name */
        private static final String f63414c = "com.hihonor.cloudservice.oaid.IOAIDCallBack";

        public AbstractBinderC0667b() {
            attachInterface(this, f63414c);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f63414c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
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
                parcel.enforceInterface(f63414c);
                a(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i4 != 2) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(f63414c);
                return true;
            } else {
                parcel.enforceInterface(f63414c);
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
        }

        public static boolean a(b bVar) {
            if (a.f63415a != null || bVar == null) {
                return false;
            }
            a.f63415a = bVar;
            return true;
        }

        public static b a() {
            return a.f63415a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IOAIDCallBack.java */
        /* renamed from: com.umeng.analytics.pro.b$b$a */
        /* loaded from: classes6.dex */
        public static class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static b f63415a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f63416b;

            a(IBinder iBinder) {
                this.f63416b = iBinder;
            }

            public String a() {
                return AbstractBinderC0667b.f63414c;
            }

            @Override // com.umeng.analytics.pro.b
            public void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0667b.f63414c);
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
                    if (!this.f63416b.transact(1, obtain, obtain2, 0) && AbstractBinderC0667b.a() != null) {
                        AbstractBinderC0667b.a().a(i4, j4, z4, f5, d5, str);
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
                return this.f63416b;
            }

            @Override // com.umeng.analytics.pro.b
            public void a(int i4, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0667b.f63414c);
                    obtain.writeInt(i4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f63416b.transact(2, obtain, obtain2, 0) && AbstractBinderC0667b.a() != null) {
                        AbstractBinderC0667b.a().a(i4, bundle);
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
