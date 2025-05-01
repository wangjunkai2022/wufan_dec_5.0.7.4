package com.beizi.fusion.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;
/* compiled from: ASUSIDInterface.java */
/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* compiled from: ASUSIDInterface.java */
    /* renamed from: com.beizi.fusion.e.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0190a implements a {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f6811a;

        public C0190a(IBinder iBinder) {
            this.f6811a = iBinder;
        }

        public String a() {
            String str;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                this.f6811a.transact(3, obtain, obtain2, 0);
                obtain2.readException();
                str = obtain2.readString();
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                th.printStackTrace();
                str = null;
            }
            obtain.recycle();
            obtain2.recycle();
            return str;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f6811a;
        }
    }
}
