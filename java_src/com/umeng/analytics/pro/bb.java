package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.umeng.analytics.pro.b;
import com.umeng.analytics.pro.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: HonorDeviceIdSupplier.java */
/* loaded from: classes6.dex */
class bb implements ax {

    /* renamed from: a  reason: collision with root package name */
    private static String f63417a = "";

    /* compiled from: HonorDeviceIdSupplier.java */
    /* loaded from: classes6.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f63418a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f63419b;

        public IBinder a() throws InterruptedException {
            if (!this.f63418a) {
                this.f63418a = true;
                return this.f63419b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f63419b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.f63418a = false;
            this.f63419b = new LinkedBlockingQueue<>();
        }
    }

    /* compiled from: HonorDeviceIdSupplier.java */
    /* loaded from: classes6.dex */
    private static final class b extends b.AbstractBinderC0667b {
        @Override // com.umeng.analytics.pro.b
        public void a(int i4, long j4, boolean z4, float f5, double d5, String str) throws RemoteException {
        }

        @Override // com.umeng.analytics.pro.b
        public void a(int i4, Bundle bundle) throws RemoteException {
            if (i4 != 0 || bundle == null) {
                return;
            }
            String unused = bb.f63417a = bundle.getString(c.f63421b);
        }

        private b() {
        }
    }

    /* compiled from: HonorDeviceIdSupplier.java */
    /* loaded from: classes6.dex */
    interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f63420a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final String f63421b = "oa_id_flag";
    }

    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        a aVar = new a();
        Intent intent = new Intent();
        intent.setAction("com.hihonor.id.HnOaIdService");
        intent.setPackage("com.hihonor.id");
        if (context.bindService(intent, aVar, 1)) {
            try {
                c.b.a(aVar.a()).a(new b());
                return f63417a;
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
