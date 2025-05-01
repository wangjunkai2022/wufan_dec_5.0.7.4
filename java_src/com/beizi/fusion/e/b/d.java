package com.beizi.fusion.e.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: OnePlusIDInterface.java */
/* loaded from: classes2.dex */
public interface d extends IInterface {

    /* compiled from: OnePlusIDInterface.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements d {

        /* compiled from: OnePlusIDInterface.java */
        /* renamed from: com.beizi.fusion.e.b.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0192a implements d {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f6814a;

            public C0192a(IBinder iBinder) {
                this.f6814a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                        obtain.writeString(str);
                        obtain.writeString(str2);
                        obtain.writeString(str3);
                        this.f6814a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        obtain.recycle();
                        obtain2.recycle();
                        return null;
                    }
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6814a;
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new C0192a(iBinder);
        }
    }
}
