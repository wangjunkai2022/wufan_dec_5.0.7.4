package com.ss.android.socialbase.downloader.m;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.m.m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
/* loaded from: classes5.dex */
public interface p extends IInterface {
    DownloadInfo i(int i4, long j4) throws RemoteException;

    List<DownloadInfo> i(String str) throws RemoteException;

    void i(int i4) throws RemoteException;

    boolean i() throws RemoteException;

    DownloadInfo k(int i4) throws RemoteException;

    DownloadInfo m(int i4) throws RemoteException;

    DownloadInfo m(int i4, long j4) throws RemoteException;

    List<DownloadInfo> m() throws RemoteException;

    List<DownloadInfo> m(String str) throws RemoteException;

    void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) throws RemoteException;

    void m(DownloadInfo downloadInfo) throws RemoteException;

    void m(com.ss.android.socialbase.downloader.model.m mVar) throws RemoteException;

    DownloadInfo n(int i4) throws RemoteException;

    DownloadInfo o(int i4, long j4) throws RemoteException;

    boolean o() throws RemoteException;

    boolean o(int i4) throws RemoteException;

    DownloadInfo p(int i4, long j4) throws RemoteException;

    List<com.ss.android.socialbase.downloader.model.m> p(int i4) throws RemoteException;

    List<DownloadInfo> p(String str) throws RemoteException;

    void p() throws RemoteException;

    DownloadInfo qv(int i4) throws RemoteException;

    boolean u(int i4) throws RemoteException;

    DownloadInfo vv(int i4, int i5) throws RemoteException;

    DownloadInfo vv(int i4, long j4) throws RemoteException;

    DownloadInfo vv(int i4, long j4, String str, String str2) throws RemoteException;

    List<DownloadInfo> vv(String str) throws RemoteException;

    void vv() throws RemoteException;

    void vv(int i4, int i5, int i6, int i7) throws RemoteException;

    void vv(int i4, int i5, int i6, long j4) throws RemoteException;

    void vv(int i4, int i5, long j4) throws RemoteException;

    void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) throws RemoteException;

    void vv(m mVar) throws RemoteException;

    void vv(com.ss.android.socialbase.downloader.model.m mVar) throws RemoteException;

    boolean vv(int i4) throws RemoteException;

    boolean vv(DownloadInfo downloadInfo) throws RemoteException;

    DownloadInfo wv(int i4) throws RemoteException;

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements p {
        public vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        public static p u() {
            return C0646vv.vv;
        }

        public static p vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            if (queryLocalInterface != null && (queryLocalInterface instanceof p)) {
                return (p) queryLocalInterface;
            }
            return new C0646vv(iBinder);
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
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean vv = vv(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(vv ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo m4 = m(parcel.readInt());
                        parcel2.writeNoException();
                        if (m4 != null) {
                            parcel2.writeInt(1);
                            m4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> vv2 = vv(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(vv2);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> m5 = m(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(m5);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> p4 = p(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(p4);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> i6 = i(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(i6);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> m6 = m();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(m6);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<com.ss.android.socialbase.downloader.model.m> p5 = p(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(p5);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        i(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(parcel.readInt() != 0 ? com.ss.android.socialbase.downloader.model.m.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        m(parcel.readInt() != 0 ? com.ss.android.socialbase.downloader.model.m.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo vv3 = vv(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (vv3 != null) {
                            parcel2.writeInt(1);
                            vv3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean vv4 = vv(parcel.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(vv4 ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean o4 = o(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(o4 ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean u4 = u(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(u4 ? 1 : 0);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        p();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo n4 = n(parcel.readInt());
                        parcel2.writeNoException();
                        if (n4 != null) {
                            parcel2.writeInt(1);
                            n4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo vv5 = vv(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (vv5 != null) {
                            parcel2.writeInt(1);
                            vv5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo vv6 = vv(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (vv6 != null) {
                            parcel2.writeInt(1);
                            vv6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo m7 = m(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (m7 != null) {
                            parcel2.writeInt(1);
                            m7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo qv = qv(parcel.readInt());
                        parcel2.writeNoException();
                        if (qv != null) {
                            parcel2.writeInt(1);
                            qv.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo p6 = p(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (p6 != null) {
                            parcel2.writeInt(1);
                            p6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo i7 = i(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (i7 != null) {
                            parcel2.writeInt(1);
                            i7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo o5 = o(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (o5 != null) {
                            parcel2.writeInt(1);
                            o5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo wv = wv(parcel.readInt());
                        parcel2.writeNoException();
                        if (wv != null) {
                            parcel2.writeInt(1);
                            wv.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo k4 = k(parcel.readInt());
                        parcel2.writeNoException();
                        if (k4 != null) {
                            parcel2.writeInt(1);
                            k4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean i8 = i();
                        parcel2.writeNoException();
                        parcel2.writeInt(i8 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean o6 = o();
                        parcel2.writeNoException();
                        parcel2.writeInt(o6 ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        m(parcel.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.m.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        m(parcel.readInt(), parcel.createTypedArrayList(com.ss.android.socialbase.downloader.model.m.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        vv(m.vv.vv(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.m.p$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0646vv implements p {
            public static p vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f61167m;

            C0646vv(IBinder iBinder) {
                this.f61167m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f61167m;
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<DownloadInfo> i(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f61167m.transact(7, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().i(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo k(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(30, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().k(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo m(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(3, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().m(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo n(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(21, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().n(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public boolean o(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(18, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().o(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<DownloadInfo> p(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f61167m.transact(6, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().p(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo qv(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(25, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().qv(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public boolean u(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(19, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().u(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p
            public void vv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f61167m.transact(1, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo wv(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(29, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().wv(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p
            public boolean vv(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(2, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void i(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(10, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().i(i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p
            public DownloadInfo o(int i4, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(28, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().o(i4, j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<com.ss.android.socialbase.downloader.model.m> p(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    if (!this.f61167m.transact(9, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().p(i4);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(com.ss.android.socialbase.downloader.model.m.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<DownloadInfo> m(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f61167m.transact(5, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().m(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<DownloadInfo> vv(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f61167m.transact(4, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo i(int i4, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(27, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().i(i4, j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f61167m.transact(20, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().p();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public List<DownloadInfo> m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f61167m.transact(8, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().m();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public boolean o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f61167m.transact(32, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().o();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo p(int i4, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(26, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().p(i4, j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void vv(com.ss.android.socialbase.downloader.model.m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (mVar != null) {
                        obtain.writeInt(1);
                        mVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f61167m.transact(11, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(mVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public boolean i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f61167m.transact(31, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().i();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void m(com.ss.android.socialbase.downloader.model.m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (mVar != null) {
                        obtain.writeInt(1);
                        mVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f61167m.transact(12, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().m(mVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void vv(int i4, int i5, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(13, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(i4, i5, j4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo m(int i4, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(24, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().m(i4, j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void vv(int i4, int i5, int i6, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(14, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(i4, i5, i6, j4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void m(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f61167m.transact(33, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().m(downloadInfo);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void vv(int i4, int i5, int i6, int i7) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    if (!this.f61167m.transact(15, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(i4, i5, i6, i7);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeTypedList(list);
                    if (!this.f61167m.transact(35, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().m(i4, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo vv(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f61167m.transact(16, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public boolean vv(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f61167m.transact(17, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(downloadInfo);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo vv(int i4, long j4, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f61167m.transact(22, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(i4, j4, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public DownloadInfo vv(int i4, long j4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeLong(j4);
                    if (!this.f61167m.transact(23, obtain, obtain2, 0) && vv.u() != null) {
                        return vv.u().vv(i4, j4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
            public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i4);
                    obtain.writeTypedList(list);
                    if (!this.f61167m.transact(34, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(i4, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.m.p
            public void vv(m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    if (!this.f61167m.transact(36, obtain, obtain2, 0) && vv.u() != null) {
                        vv.u().vv(mVar);
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
