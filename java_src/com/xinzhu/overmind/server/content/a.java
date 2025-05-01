package com.xinzhu.overmind.server.content;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMindContentService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IMindContentService.java */
    /* renamed from: com.xinzhu.overmind.server.content.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0752a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.content.a
        public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i4, int i5) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.content.a
        public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i4, int i5) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.content.a
        public void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException {
        }
    }

    /* compiled from: IMindContentService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.content.IMindContentService";
        static final int TRANSACTION_notifyChange = 3;
        static final int TRANSACTION_registerContentObserver = 2;
        static final int TRANSACTION_unregisterContentObserver = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindContentService.java */
        /* renamed from: com.xinzhu.overmind.server.content.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0753a implements a {

            /* renamed from: c  reason: collision with root package name */
            public static a f67949c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67950b;

            C0753a(IBinder iBinder) {
                this.f67950b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67950b;
            }

            @Override // com.xinzhu.overmind.server.content.a
            public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    int i6 = 1;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iContentObserver != null ? iContentObserver.asBinder() : null);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (!z5) {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    try {
                        if (!this.f67950b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                            b.getDefaultImpl().notifyChange(uri, iContentObserver, z4, z5, i4, i5);
                            obtain2.recycle();
                            obtain.recycle();
                            return;
                        }
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.xinzhu.overmind.server.content.a
            public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    int i6 = 1;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z4) {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    obtain.writeStrongBinder(iContentObserver != null ? iContentObserver.asBinder() : null);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67950b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().registerContentObserver(uri, z4, iContentObserver, i4, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.content.a
            public void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iContentObserver != null ? iContentObserver.asBinder() : null);
                    if (!this.f67950b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().unregisterContentObserver(iContentObserver);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return b.DESCRIPTOR;
            }
        }

        public b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0753a(iBinder);
        }

        public static a getDefaultImpl() {
            return C0753a.f67949c;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0753a.f67949c == null) {
                if (aVar != null) {
                    C0753a.f67949c = aVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterContentObserver(IContentObserver.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                registerContentObserver(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, IContentObserver.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i4 != 3) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                notifyChange(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, IContentObserver.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i4, int i5) throws RemoteException;

    void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i4, int i5) throws RemoteException;

    void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException;
}
