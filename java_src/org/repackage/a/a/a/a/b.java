package org.repackage.a.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import e4.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: OpenIDHelper.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public e4.a f72969a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f72970b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f72971c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Object f72972d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public ServiceConnection f72973e = new a();

    /* compiled from: OpenIDHelper.java */
    /* loaded from: classes7.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f72969a = a.AbstractBinderC0766a.a(iBinder);
            synchronized (b.this.f72972d) {
                b.this.f72972d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f72969a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OpenIDHelper.java */
    /* renamed from: org.repackage.a.a.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0802b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72975a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
    }

    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f72969a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f72973e, 1)) {
                    synchronized (this.f72972d) {
                        try {
                            this.f72972d.wait(3000L);
                        } catch (InterruptedException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
                if (this.f72969a == null) {
                    return "";
                }
                try {
                    return c(context, str);
                } catch (RemoteException e6) {
                    e6.printStackTrace();
                    return "";
                }
            }
            try {
                return c(context, str);
            } catch (RemoteException e7) {
                e7.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }

    public boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f72970b)) {
            this.f72970b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f72971c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f72970b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e5) {
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
                } catch (NoSuchAlgorithmException e6) {
                    e6.printStackTrace();
                }
            }
            this.f72971c = str2;
        }
        String a5 = ((a.AbstractBinderC0766a.C0767a) this.f72969a).a(this.f72970b, this.f72971c, str);
        return TextUtils.isEmpty(a5) ? "" : a5;
    }
}
