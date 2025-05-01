package com.ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.jh;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.ns;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.qv;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.wv;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.depend.zn;
/* loaded from: classes5.dex */
public interface vv extends IInterface {
    n b() throws RemoteException;

    w i() throws RemoteException;

    int jh() throws RemoteException;

    k k() throws RemoteException;

    com.ss.android.socialbase.downloader.depend.o m() throws RemoteException;

    wv m(int i4) throws RemoteException;

    y n() throws RemoteException;

    qv o() throws RemoteException;

    jh p(int i4) throws RemoteException;

    ns p() throws RemoteException;

    zn qv() throws RemoteException;

    u u() throws RemoteException;

    int vv(int i4) throws RemoteException;

    wv vv(int i4, int i5) throws RemoteException;

    DownloadInfo vv() throws RemoteException;

    j wv() throws RemoteException;

    /* renamed from: com.ss.android.socialbase.downloader.model.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC0647vv extends Binder implements vv {
        public AbstractBinderC0647vv() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        public static vv r() {
            return C0648vv.vv;
        }

        public static vv vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            if (queryLocalInterface != null && (queryLocalInterface instanceof vv)) {
                return (vv) queryLocalInterface;
            }
            return new C0648vv(iBinder);
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
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo vv = vv();
                        parcel2.writeNoException();
                        if (vv != null) {
                            parcel2.writeInt(1);
                            vv.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        com.ss.android.socialbase.downloader.depend.o m4 = m();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(m4 != null ? m4.asBinder() : null);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int vv2 = vv(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(vv2);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        wv vv3 = vv(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(vv3 != null ? vv3.asBinder() : null);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        wv m5 = m(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(m5 != null ? m5.asBinder() : null);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        ns p4 = p();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(p4 != null ? p4.asBinder() : null);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        w i6 = i();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(i6 != null ? i6.asBinder() : null);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        qv o4 = o();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(o4 != null ? o4.asBinder() : null);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        u u4 = u();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(u4 != null ? u4.asBinder() : null);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        y n4 = n();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(n4 != null ? n4.asBinder() : null);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        zn qv = qv();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(qv != null ? qv.asBinder() : null);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        j wv = wv();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(wv != null ? wv.asBinder() : null);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        k k4 = k();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(k4 != null ? k4.asBinder() : null);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        n b5 = b();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(b5 != null ? b5.asBinder() : null);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int jh = jh();
                        parcel2.writeNoException();
                        parcel2.writeInt(jh);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        jh p5 = p(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(p5 != null ? p5.asBinder() : null);
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.model.vv$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0648vv implements vv {
            public static vv vv;

            /* renamed from: m  reason: collision with root package name */
            private IBinder f61229m;

            C0648vv(IBinder iBinder) {
                this.f61229m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f61229m;
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public n b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(14, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().b();
                    }
                    obtain2.readException();
                    return n.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public w i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(7, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().i();
                    }
                    obtain2.readException();
                    return w.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public int jh() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(15, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().jh();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public k k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(13, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().k();
                    }
                    obtain2.readException();
                    return k.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.o m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(2, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().m();
                    }
                    obtain2.readException();
                    return o.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public y n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(10, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().n();
                    }
                    obtain2.readException();
                    return y.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public qv o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(8, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().o();
                    }
                    obtain2.readException();
                    return qv.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public ns p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(6, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().p();
                    }
                    obtain2.readException();
                    return ns.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public zn qv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(11, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().qv();
                    }
                    obtain2.readException();
                    return zn.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public u u() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(9, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().u();
                    }
                    obtain2.readException();
                    return u.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public DownloadInfo vv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(1, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().vv();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public j wv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f61229m.transact(12, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().wv();
                    }
                    obtain2.readException();
                    return j.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public wv m(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i4);
                    if (!this.f61229m.transact(5, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().m(i4);
                    }
                    obtain2.readException();
                    return wv.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public jh p(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i4);
                    if (!this.f61229m.transact(16, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().p(i4);
                    }
                    obtain2.readException();
                    return jh.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public int vv(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i4);
                    if (!this.f61229m.transact(3, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().vv(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public wv vv(int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f61229m.transact(4, obtain, obtain2, 0) && AbstractBinderC0647vv.r() != null) {
                        return AbstractBinderC0647vv.r().vv(i4, i5);
                    }
                    obtain2.readException();
                    return wv.vv.vv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
