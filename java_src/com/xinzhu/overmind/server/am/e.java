package com.xinzhu.overmind.server.am;

import android.app.job.JobInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xinzhu.overmind.entity.JobRecord;
/* compiled from: IMindJobManagerService.java */
/* loaded from: classes.dex */
public interface e extends IInterface {

    /* compiled from: IMindJobManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.e
        public int cancel(String str, int i4, int i5) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.am.e
        public void cancelAll(String str, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.e
        public JobRecord queryJobRecord(String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.e
        public JobInfo schedule(JobInfo jobInfo, int i4) throws RemoteException {
            return null;
        }
    }

    /* compiled from: IMindJobManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements e {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.am.IMindJobManagerService";
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_queryJobRecord = 2;
        static final int TRANSACTION_schedule = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindJobManagerService.java */
        /* loaded from: classes.dex */
        public static class a implements e {

            /* renamed from: c  reason: collision with root package name */
            public static e f67934c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67935b;

            a(IBinder iBinder) {
                this.f67935b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67935b;
            }

            @Override // com.xinzhu.overmind.server.am.e
            public int cancel(String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67935b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().cancel(str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.e
            public void cancelAll(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67935b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().cancelAll(str, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.e
            public JobRecord queryJobRecord(String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67935b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().queryJobRecord(str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? JobRecord.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.e
            public JobInfo schedule(JobInfo jobInfo, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (jobInfo != null) {
                        obtain.writeInt(1);
                        jobInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67935b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().schedule(jobInfo, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (JobInfo) JobInfo.CREATOR.createFromParcel(obtain2) : null;
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

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static e getDefaultImpl() {
            return a.f67934c;
        }

        public static boolean setDefaultImpl(e eVar) {
            if (a.f67934c == null) {
                if (eVar != null) {
                    a.f67934c = eVar;
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
                JobInfo schedule = schedule(parcel.readInt() != 0 ? (JobInfo) JobInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                if (schedule != null) {
                    parcel2.writeInt(1);
                    schedule.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i4 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                JobRecord queryJobRecord = queryJobRecord(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (queryJobRecord != null) {
                    parcel2.writeInt(1);
                    queryJobRecord.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i4 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i4 != 4) {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                int cancel = cancel(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(cancel);
                return true;
            }
        }
    }

    int cancel(String str, int i4, int i5) throws RemoteException;

    void cancelAll(String str, int i4) throws RemoteException;

    JobRecord queryJobRecord(String str, int i4, int i5) throws RemoteException;

    JobInfo schedule(JobInfo jobInfo, int i4) throws RemoteException;
}
