package com.umeng.commonsdk.statistics.common;

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
/* compiled from: AdvertisingId.java */
/* loaded from: classes6.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0674a {

        /* renamed from: a  reason: collision with root package name */
        private final String f64388a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f64389b;

        C0674a(String str, boolean z4) {
            this.f64388a = str;
            this.f64389b = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f64388a;
        }

        public boolean a() {
            return this.f64389b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* loaded from: classes6.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f64390a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f64391b;

        private b() {
            this.f64390a = false;
            this.f64391b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() throws InterruptedException {
            if (!this.f64390a) {
                this.f64390a = true;
                return this.f64391b.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f64391b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static String a(Context context) {
        try {
            C0674a c5 = c(context);
            if (c5 != null && !c5.a()) {
                return c5.b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String b(Context context) {
        try {
            C0674a c5 = c(context);
            if (c5 == null) {
                return null;
            }
            return c5.b();
        } catch (Exception unused) {
            return null;
        }
    }

    private static C0674a c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            if (com.umeng.commonsdk.utils.b.a().a(context, com.xinzhu.overmind.client.hook.env.b.f67615e, 0) == null) {
                return null;
            }
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage(com.xinzhu.overmind.client.hook.env.b.f67613c);
            try {
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        c cVar = new c(bVar.a());
                        boolean a5 = cVar.a(true);
                        return new C0674a(a5 ? "" : cVar.a(), a5);
                    } catch (Exception e5) {
                        throw e5;
                    }
                }
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(bVar);
            }
        } catch (Exception e6) {
            throw e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdvertisingId.java */
    /* loaded from: classes6.dex */
    public static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f64392a;

        public c(IBinder iBinder) {
            this.f64392a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f64392a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f64392a;
        }

        public boolean a(boolean z4) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z4 ? 1 : 0);
                this.f64392a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
