package com.xinzhu.overmind.client;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IOverlord.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* compiled from: IOverlord.java */
    /* loaded from: classes6.dex */
    public static class a implements c {
        @Override // com.xinzhu.overmind.client.c
        public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.client.c
        public void bindApplication() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.client.c
        public void finishActivity(IBinder iBinder) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.client.c
        public IBinder getActivityThread() throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.client.c
        public void handleNewIntent(IBinder iBinder, Intent intent) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.client.c
        public IBinder peekService(Intent intent) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.client.c
        public void restartJobService(String str) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.client.c
        public void stopService(Intent intent) throws RemoteException {
        }
    }

    /* compiled from: IOverlord.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements c {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.client.IOverlord";
        static final int TRANSACTION_acquireContentProviderClient = 5;
        static final int TRANSACTION_bindApplication = 2;
        static final int TRANSACTION_finishActivity = 7;
        static final int TRANSACTION_getActivityThread = 1;
        static final int TRANSACTION_handleNewIntent = 8;
        static final int TRANSACTION_peekService = 6;
        static final int TRANSACTION_restartJobService = 4;
        static final int TRANSACTION_stopService = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IOverlord.java */
        /* loaded from: classes.dex */
        public static class a implements c {

            /* renamed from: c  reason: collision with root package name */
            public static c f67456c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67457b;

            a(IBinder iBinder) {
                this.f67457b = iBinder;
            }

            @Override // com.xinzhu.overmind.client.c
            public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67457b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().acquireContentProviderClient(providerInfo);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67457b;
            }

            @Override // com.xinzhu.overmind.client.c
            public void bindApplication() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67457b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().bindApplication();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public void finishActivity(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67457b.transact(7, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().finishActivity(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public IBinder getActivityThread() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (!this.f67457b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getActivityThread();
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public void handleNewIntent(IBinder iBinder, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67457b.transact(8, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().handleNewIntent(iBinder, intent);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public IBinder peekService(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67457b.transact(6, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().peekService(intent);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public void restartJobService(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f67457b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().restartJobService(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.client.c
            public void stopService(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67457b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().stopService(intent);
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

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static c getDefaultImpl() {
            return a.f67456c;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (a.f67456c == null) {
                if (cVar != null) {
                    a.f67456c = cVar;
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
            if (i4 != 1598968902) {
                switch (i4) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder activityThread = getActivityThread();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(activityThread);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        bindApplication();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        stopService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        restartJobService(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder acquireContentProviderClient = acquireContentProviderClient(parcel.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(acquireContentProviderClient);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder peekService = peekService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(peekService);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        finishActivity(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        handleNewIntent(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException;

    void bindApplication() throws RemoteException;

    void finishActivity(IBinder iBinder) throws RemoteException;

    IBinder getActivityThread() throws RemoteException;

    void handleNewIntent(IBinder iBinder, Intent intent) throws RemoteException;

    IBinder peekService(Intent intent) throws RemoteException;

    void restartJobService(String str) throws RemoteException;

    void stopService(Intent intent) throws RemoteException;
}
