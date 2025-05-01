package com.beizi.fusion.sm.a.a;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.beizi.fusion.sm.a.a.m;
import com.beizi.fusion.sm.repeackage.com.heytap.openid.IOpenID;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OppoImpl.java */
/* loaded from: classes2.dex */
public class n implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7104a;

    /* renamed from: b  reason: collision with root package name */
    private String f7105b;

    public n(Context context) {
        if (context instanceof Application) {
            this.f7104a = context;
        } else {
            this.f7104a = context.getApplicationContext();
        }
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        Context context = this.f7104a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
            return false;
        }
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7104a == null || cVar == null) {
            return;
        }
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        m.a(this.f7104a, intent, cVar, new m.a() { // from class: com.beizi.fusion.sm.a.a.n.1
            @Override // com.beizi.fusion.sm.a.a.m.a
            public String a(IBinder iBinder) throws com.beizi.fusion.sm.a.e, RemoteException {
                try {
                    return n.this.a(iBinder);
                } catch (RemoteException e5) {
                    throw e5;
                } catch (com.beizi.fusion.sm.a.e e6) {
                    throw e6;
                } catch (Exception e7) {
                    throw new com.beizi.fusion.sm.a.e(e7);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PackageManagerGetSignatures"})
    public String a(IBinder iBinder) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException, com.beizi.fusion.sm.a.e {
        String packageName = this.f7104a.getPackageName();
        String str = this.f7105b;
        if (str == null) {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(this.f7104a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                sb.append(Integer.toHexString((b5 & 255) | 256).substring(1, 3));
            }
            String sb2 = sb.toString();
            this.f7105b = sb2;
            return a(iBinder, packageName, sb2);
        }
        return a(iBinder, packageName, str);
    }

    private String a(IBinder iBinder, String str, String str2) throws RemoteException, com.beizi.fusion.sm.a.e {
        IOpenID asInterface = IOpenID.Stub.asInterface(iBinder);
        if (asInterface != null) {
            return asInterface.getSerID(str, str2, "OUID");
        }
        throw new com.beizi.fusion.sm.a.e("IOpenID is null");
    }
}
