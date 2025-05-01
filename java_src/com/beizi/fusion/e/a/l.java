package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.g;
import com.bun.miitmdid.content.StringValues;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ZTEDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    Context f6806a;

    /* renamed from: b  reason: collision with root package name */
    String f6807b = "com.mdid.msa";

    /* renamed from: c  reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f6808c = new LinkedBlockingQueue<>(1);

    /* renamed from: d  reason: collision with root package name */
    ServiceConnection f6809d = new ServiceConnection() { // from class: com.beizi.fusion.e.a.l.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l.this.f6808c.put(iBinder);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public l(Context context) {
        this.f6806a = context;
    }

    private int a() {
        try {
            this.f6806a.getPackageManager().getPackageInfo(this.f6807b, 0);
            return 1;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    private void a(String str) {
        a();
        Intent intent = new Intent();
        intent.setClassName(this.f6807b, "com.mdid.msa.service.MsaKlService");
        intent.setAction(StringValues.ACTION_START_MSASERVICE);
        intent.putExtra(StringValues.PARAM_BIND_PKGNAME, str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            this.f6806a.startService(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(b.a aVar) {
        try {
            this.f6806a.getPackageManager().getPackageInfo(this.f6807b, 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        String packageName = this.f6806a.getPackageName();
        a(packageName);
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction(StringValues.ACTION_BINDTO_MSASERVICE);
        intent.putExtra(StringValues.PARAM_BIND_PKGNAME, packageName);
        if (this.f6806a.bindService(intent, this.f6809d, 1)) {
            try {
                String a5 = new g.a.C0194a(this.f6808c.take()).a();
                if (aVar != null) {
                    aVar.a(a5);
                }
                this.f6806a.unbindService(this.f6809d);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
