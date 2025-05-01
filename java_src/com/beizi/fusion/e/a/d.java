package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.c;
/* compiled from: LenovoDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    com.beizi.fusion.e.b.c f6777a;

    /* renamed from: b  reason: collision with root package name */
    ServiceConnection f6778b = new ServiceConnection() { // from class: com.beizi.fusion.e.a.d.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f6777a = new c.a.C0191a(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private Context f6779c;

    public d(Context context) {
        this.f6779c = context;
    }

    public void a(b.a aVar) {
        com.beizi.fusion.e.b.c cVar;
        this.f6779c.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (!this.f6779c.bindService(intent, this.f6778b, 1) || (cVar = this.f6777a) == null) {
            return;
        }
        String a5 = cVar.a();
        if (aVar != null) {
            aVar.a(a5);
        }
    }
}
