package com.ss.android.downloadlib.vv.vv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.b;
import com.umeng.analytics.pro.bm;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public interface i extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class vv extends Binder implements i {
        private static String vv = "";

        /* renamed from: com.ss.android.downloadlib.vv.vv.i$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        private static class C0619vv implements i {
            private IBinder vv;

            C0619vv(IBinder iBinder) {
                if (TextUtils.isEmpty(vv.vv)) {
                    JSONObject wv = b.wv();
                    String unused = vv.vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString(bm.aM), wv.optString("s"));
                }
                this.vv = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.vv;
            }

            @Override // com.ss.android.downloadlib.vv.vv.i
            public void vv(m mVar) throws RemoteException {
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
                    this.vv.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 == 1) {
                parcel.enforceInterface(vv);
                vv(parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                parcel2.writeString(vv);
                return true;
            }
        }

        public static i vv(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(vv);
            if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
                return (i) queryLocalInterface;
            }
            return new C0619vv(iBinder);
        }
    }

    void vv(m mVar) throws RemoteException;
}
