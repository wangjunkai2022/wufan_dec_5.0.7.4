package com.xinzhu.overmind.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMindWidgetManagerService.java */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* compiled from: IMindWidgetManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IMindWidgetManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements c {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.IMindWidgetManagerService";

        /* compiled from: IMindWidgetManagerService.java */
        /* loaded from: classes.dex */
        private static class a implements c {

            /* renamed from: c  reason: collision with root package name */
            public static c f67947c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67948b;

            a(IBinder iBinder) {
                this.f67948b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67948b;
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
            return a.f67947c;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (a.f67947c == null) {
                if (cVar != null) {
                    a.f67947c = cVar;
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
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }
}
