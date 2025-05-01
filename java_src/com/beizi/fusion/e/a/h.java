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
import com.beizi.fusion.e.b.e;
import java.security.MessageDigest;
/* compiled from: OppoDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    com.beizi.fusion.e.b.e f6790b;

    /* renamed from: d  reason: collision with root package name */
    private Context f6792d;

    /* renamed from: e  reason: collision with root package name */
    private String f6793e;

    /* renamed from: a  reason: collision with root package name */
    public String f6789a = "OUID";

    /* renamed from: c  reason: collision with root package name */
    ServiceConnection f6791c = new ServiceConnection() { // from class: com.beizi.fusion.e.a.h.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.this.f6790b = e.a.a(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h.this.f6790b = null;
        }
    };

    public h(Context context) {
        this.f6792d = context;
    }

    public String a(b.a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (this.f6792d.bindService(intent, this.f6791c, 1)) {
                try {
                    SystemClock.sleep(3000L);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (this.f6790b != null) {
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
        String packageName = this.f6792d.getPackageName();
        if (this.f6793e == null) {
            String str2 = null;
            try {
                signatureArr = this.f6792d.getPackageManager().getPackageInfo(packageName, 64).signatures;
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
            this.f6793e = str2;
        }
        return ((e.a.C0193a) this.f6790b).a(packageName, this.f6793e, str);
    }
}
