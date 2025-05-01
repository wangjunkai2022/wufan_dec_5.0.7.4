package com.ss.android.downloadlib.vv.vv;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.vv.vv.i;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public interface p extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements p {
        private static String vv = "";

        /* renamed from: com.ss.android.downloadlib.vv.vv.p$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        private static class C0620vv implements p {
            private IBinder vv;

            C0620vv(IBinder iBinder) {
                if (TextUtils.isEmpty(vv.vv)) {
                    JSONObject wv = b.wv();
                    String unused = vv.vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("r"), wv.optString("s"));
                }
                this.vv = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.vv;
            }

            @Override // com.ss.android.downloadlib.vv.vv.p
            public void vv(m mVar, i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(vv.vv);
                    if (mVar != null) {
                        obtain.writeInt(1);
                        mVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.vv.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        @SuppressLint({"WrongConstant"})
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1598968902) {
                parcel2.writeString(vv);
                return true;
            }
            if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel.enforceInterface(vv);
            vv(parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null, i.vv.vv(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        public static p vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(vv);
            if (queryLocalInterface != null && (queryLocalInterface instanceof p)) {
                return (p) queryLocalInterface;
            }
            return new C0620vv(iBinder);
        }
    }

    void vv(m mVar, i iVar) throws RemoteException;
}
