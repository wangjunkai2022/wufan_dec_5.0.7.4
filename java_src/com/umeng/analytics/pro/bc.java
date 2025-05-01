package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: HuaweiDeviceIdSupplier.java */
/* loaded from: classes6.dex */
class bc implements ax {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63422a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b  reason: collision with root package name */
    private static final int f63423b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f63424c = 2;

    /* compiled from: HuaweiDeviceIdSupplier.java */
    /* loaded from: classes6.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f63425a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f63426b;

        public IBinder a() throws InterruptedException {
            if (!this.f63425a) {
                this.f63425a = true;
                return this.f63426b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f63426b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.f63425a = false;
            this.f63426b = new LinkedBlockingQueue<>();
        }
    }

    /* compiled from: HuaweiDeviceIdSupplier.java */
    /* loaded from: classes6.dex */
    private static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f63427a;

        public b(IBinder iBinder) {
            this.f63427a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(bc.f63422a);
                this.f63427a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f63427a;
        }

        public boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(bc.f63422a);
                this.f63427a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
