package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.b;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: HWDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f6773a = new LinkedBlockingQueue<>(1);

    /* renamed from: b  reason: collision with root package name */
    ServiceConnection f6774b = new ServiceConnection() { // from class: com.beizi.fusion.e.a.c.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                c.this.f6773a.put(iBinder);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private Context f6775c;

    public c(Context context) {
        this.f6775c = context;
    }

    public void a(b.a aVar) {
        try {
            this.f6775c.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            if (this.f6775c.bindService(intent, this.f6774b, 1)) {
                try {
                    b.a aVar2 = new b.a(this.f6773a.take());
                    String a5 = aVar2.a();
                    aVar2.b();
                    if (aVar != null) {
                        aVar.a(a5);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        } finally {
            this.f6775c.unbindService(this.f6774b);
        }
    }
}
