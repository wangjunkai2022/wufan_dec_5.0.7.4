package com.beizi.fusion.e.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: ZTEIDInterface.java */
/* loaded from: classes2.dex */
public interface g extends IInterface {

    /* compiled from: ZTEIDInterface.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements g {

        /* compiled from: ZTEIDInterface.java */
        /* renamed from: com.beizi.fusion.e.b.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0194a implements g {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f6817a;

            public C0194a(IBinder iBinder) {
                this.f6817a = iBinder;
            }

            @Override // com.beizi.fusion.e.b.g
            public String a() {
                String str;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f6817a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readString();
                } catch (Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    str = null;
                }
                obtain2.recycle();
                obtain.recycle();
                return str;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6817a;
            }
        }
    }

    String a();
}
