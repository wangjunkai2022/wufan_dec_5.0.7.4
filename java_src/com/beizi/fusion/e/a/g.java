package com.beizi.fusion.e.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.e.b.d;
import java.security.MessageDigest;
/* compiled from: OnePlusDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    com.beizi.fusion.e.b.d f6784b;

    /* renamed from: d  reason: collision with root package name */
    private Context f6786d;

    /* renamed from: e  reason: collision with root package name */
    private String f6787e;

    /* renamed from: a  reason: collision with root package name */
    public String f6783a = "OUID";

    /* renamed from: c  reason: collision with root package name */
    ServiceConnection f6785c = new ServiceConnection() { // from class: com.beizi.fusion.e.a.g.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.this.f6784b = d.a.a(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g.this.f6784b = null;
        }
    };

    public g(Context context) {
        this.f6786d = context;
    }

    public String a(b.a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (this.f6786d.bindService(intent, this.f6785c, 1)) {
                try {
                    SystemClock.sleep(3000L);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (this.f6784b != null) {
                    String a5 = a("OUID");
                    if (aVar != null) {
                        aVar.a(a5);
                        return a5;
                    }
                    return a5;
                }
            }
            return null;
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }

    private String a(String str) {
        Signature[] signatureArr;
        String packageName = this.f6786d.getPackageName();
        if (this.f6787e == null) {
            String str2 = null;
            try {
                signatureArr = this.f6786d.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e5) {
                e5.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b5 : digest) {
                            sb.append(Integer.toHexString((b5 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            this.f6787e = str2;
        }
        return ((d.a.C0192a) this.f6784b).a(packageName, this.f6787e, str);
    }
}
