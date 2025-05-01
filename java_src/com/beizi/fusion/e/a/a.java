package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.a;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ASUSDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f6766a = new LinkedBlockingQueue<>(1);

    /* renamed from: b  reason: collision with root package name */
    ServiceConnection f6767b = new ServiceConnection() { // from class: com.beizi.fusion.e.a.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a.this.f6766a.put(iBinder);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private Context f6768c;

    public a(Context context) {
        this.f6768c = context;
    }

    public void a(b.a aVar) {
        try {
            this.f6768c.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        if (this.f6768c.bindService(intent, this.f6767b, 1)) {
            try {
                String a5 = new a.C0190a(this.f6766a.take()).a();
                if (aVar != null) {
                    aVar.a(a5);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
