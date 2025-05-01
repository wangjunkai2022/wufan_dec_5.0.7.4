package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.core.view.InputDeviceCompat;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f56214a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f56215b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56216c = false;

    /* renamed from: d  reason: collision with root package name */
    private String f56217d = null;

    /* renamed from: e  reason: collision with root package name */
    private int f56218e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f56219a;

        /* renamed from: c  reason: collision with root package name */
        private final BlockingQueue<IBinder> f56221c;

        private a() {
            this.f56219a = false;
            this.f56221c = new LinkedBlockingQueue();
        }

        public IBinder a(long j4) throws InterruptedException {
            if (!this.f56219a) {
                this.f56219a = true;
                BlockingQueue<IBinder> blockingQueue = this.f56221c;
                if (j4 <= 0) {
                    j4 = 1500;
                }
                return blockingQueue.poll(j4, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f56221c.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f56222a;
    }

    public h(Context context) {
        this.f56214a = context;
        this.f56215b = context.getPackageName();
    }

    private synchronized void e() {
        if (this.f56216c) {
            return;
        }
        if (!a(a())) {
            if (this.f56218e >= 4) {
                this.f56216c = true;
            }
        } else {
            this.f56216c = true;
        }
    }

    protected Intent a() {
        return null;
    }

    protected b a(IBinder iBinder) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(String str) {
        if (str != null) {
            if (!Pattern.compile("^[0fF\\-]+").matcher(str).matches()) {
                this.f56217d = str;
            }
        }
    }

    protected b b() {
        return null;
    }

    protected long c() {
        return (((this.f56218e - 1) * 2) + 2) * 1000;
    }

    public synchronized String d() {
        e();
        return this.f56217d;
    }

    private synchronized boolean a(Intent intent) {
        boolean z4;
        z4 = true;
        this.f56218e++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b b5 = b();
        if (b5 == null) {
            b5 = a(this.f56214a, intent);
        }
        if (b5 != null) {
            this.f56217d = b5.f56222a;
        } else {
            z4 = false;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        MobLog.getInstance().d("oa use time: " + elapsedRealtime2, new Object[0]);
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str, IBinder iBinder, String str2, int i4, String... strArr) {
        Parcel parcel;
        Parcel parcel2;
        try {
            parcel = Parcel.obtain();
            try {
                parcel2 = Parcel.obtain();
            } catch (Throwable th) {
                th = th;
                parcel2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            parcel = null;
            parcel2 = null;
        }
        try {
            parcel.writeInterfaceToken(str2);
            if (strArr != null && strArr.length > 0) {
                for (String str3 : strArr) {
                    parcel.writeString(str3);
                }
            }
            iBinder.transact(i4, parcel, parcel2, 0);
            parcel2.readException();
            String readString = parcel2.readString();
            try {
                parcel2.recycle();
                parcel.recycle();
            } catch (Throwable unused) {
            }
            return readString;
        } catch (Throwable th3) {
            th = th3;
            try {
                MobLog.getInstance().d("getStringValue: " + str + " failed! " + th.getMessage(), new Object[0]);
                if (parcel2 != null) {
                    try {
                        parcel2.recycle();
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
                if (parcel != null) {
                    parcel.recycle();
                }
                return null;
            } catch (Throwable th4) {
                if (parcel2 != null) {
                    try {
                        parcel2.recycle();
                    } catch (Throwable unused3) {
                        throw th4;
                    }
                }
                if (parcel != null) {
                    parcel.recycle();
                }
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #5 {all -> 0x005e, blocks: (B:22:0x0056, B:24:0x005b), top: B:35:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r4, android.os.IBinder r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L23 android.os.RemoteException -> L26
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r2.writeInterfaceToken(r6)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r5.transact(r7, r2, r0, r1)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r0.readException()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            int r4 = r0.readInt()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r0.recycle()     // Catch: java.lang.Throwable -> L1d
            r2.recycle()     // Catch: java.lang.Throwable -> L1d
        L1d:
            return r4
        L1e:
            r4 = move-exception
            goto L54
        L20:
            r5 = r0
            r0 = r2
            goto L27
        L23:
            r4 = move-exception
            r2 = r0
            goto L54
        L26:
            r5 = r0
        L27:
            com.mob.tools.log.NLog r6 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "getIntValue: "
            r7.append(r2)     // Catch: java.lang.Throwable -> L51
            r7.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = " failed! (remoteException)"
            r7.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L51
            r6.d(r4, r7)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L4b
            r5.recycle()     // Catch: java.lang.Throwable -> L50
        L4b:
            if (r0 == 0) goto L50
            r0.recycle()     // Catch: java.lang.Throwable -> L50
        L50:
            return r1
        L51:
            r4 = move-exception
            r2 = r0
            r0 = r5
        L54:
            if (r0 == 0) goto L59
            r0.recycle()     // Catch: java.lang.Throwable -> L5e
        L59:
            if (r2 == 0) goto L5e
            r2.recycle()     // Catch: java.lang.Throwable -> L5e
        L5e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.h.a(java.lang.String, android.os.IBinder, java.lang.String, int):int");
    }

    private b a(Context context, Intent intent) throws Throwable {
        boolean bindService;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = new a();
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    bindService = context.bindService(intent, aVar, InputDeviceCompat.SOURCE_DPAD);
                } else {
                    bindService = context.bindService(intent, aVar, 1);
                }
                if (intent != null && bindService) {
                    long c5 = c();
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("wte " + c5, new Object[0]);
                    IBinder a5 = aVar.a(c());
                    if (a5 != null) {
                        return a(a5);
                    }
                    throw new Throwable("get binder " + intent.getComponent() + " failed!");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("bind service ");
                sb.append(intent == null ? "null" : intent.getComponent());
                sb.append(" failed!");
                throw new Throwable(sb.toString());
            } finally {
                try {
                    context.unbindService(aVar);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        }
        throw new Throwable("unable to invoke in main thread!");
    }
}
