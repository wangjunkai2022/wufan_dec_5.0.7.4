package com.beizi.fusion.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: AdvertisingIdClient.java */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: AdvertisingIdClient.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6949a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6950b;

        a(String str, boolean z4) {
            this.f6949a = str;
            this.f6950b = z4;
        }

        public String a() {
            return this.f6949a;
        }

        public boolean b() {
            return this.f6950b;
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.beizi.fusion.g.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class ServiceConnectionC0195b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f6951a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f6952b;

        private ServiceConnectionC0195b() {
            this.f6951a = false;
            this.f6952b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() throws InterruptedException {
            if (!this.f6951a) {
                this.f6951a = true;
                return this.f6952b.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f6952b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static a a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo(com.xinzhu.overmind.client.hook.env.b.f67615e, 0);
                ServiceConnectionC0195b serviceConnectionC0195b = new ServiceConnectionC0195b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage(com.xinzhu.overmind.client.hook.env.b.f67613c);
                if (context.bindService(intent, serviceConnectionC0195b, 1)) {
                    try {
                        try {
                            c cVar = new c(serviceConnectionC0195b.a());
                            return new a(cVar.a(), cVar.a(true));
                        } catch (Exception e5) {
                            throw e5;
                        }
                    } finally {
                        context.unbindService(serviceConnectionC0195b);
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e6) {
                throw e6;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* compiled from: AdvertisingIdClient.java */
    /* loaded from: classes2.dex */
    private static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f6953a;

        public c(IBinder iBinder) {
            this.f6953a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f6953a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f6953a;
        }

        public boolean a(boolean z4) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z4 ? 1 : 0);
                this.f6953a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
