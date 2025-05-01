package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.f;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: SamsungDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f6795a = new LinkedBlockingQueue<>(1);

    /* renamed from: b  reason: collision with root package name */
    ServiceConnection f6796b = new ServiceConnection() { // from class: com.beizi.fusion.e.a.i.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                i.this.f6795a.put(iBinder);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private Context f6797c;

    public i(Context context) {
        this.f6797c = context;
    }

    public void a(b.a aVar) {
        try {
            this.f6797c.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f6797c.bindService(intent, this.f6796b, 1)) {
            try {
                String a5 = new f.a(this.f6795a.take()).a();
                if (aVar != null) {
                    aVar.a(a5);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
