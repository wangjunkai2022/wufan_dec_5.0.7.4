package com.alipay.sdk.util;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.util.j;
import java.util.List;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: h  reason: collision with root package name */
    public static final String f4952h = "failed";

    /* renamed from: a  reason: collision with root package name */
    private Activity f4953a;

    /* renamed from: b  reason: collision with root package name */
    private IAlixPay f4954b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4956d;

    /* renamed from: e  reason: collision with root package name */
    private a f4957e;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4955c = IAlixPay.class;

    /* renamed from: f  reason: collision with root package name */
    private ServiceConnection f4958f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    private IRemoteServiceCallback f4959g = new h(this);

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public f(Activity activity, a aVar) {
        this.f4953a = activity;
        this.f4957e = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.alipay.android.app.IAlixPay, android.content.ServiceConnection, com.alipay.android.app.IRemoteServiceCallback] */
    private String d(String str, Intent intent) {
        String str2;
        String u4 = j.u(this.f4953a);
        this.f4953a.getApplicationContext().bindService(intent, this.f4958f, 1);
        synchronized (this.f4955c) {
            if (this.f4954b == null) {
                try {
                    this.f4955c.wait(com.alipay.sdk.data.a.f().a());
                } catch (InterruptedException unused) {
                }
            }
        }
        try {
            if (this.f4954b == null) {
                String u5 = j.u(this.f4953a);
                List<PackageInfo> installedPackages = this.f4953a.getPackageManager().getInstalledPackages(0);
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                    PackageInfo packageInfo = installedPackages.get(i4);
                    int i5 = packageInfo.applicationInfo.flags;
                    if ((i5 & 1) == 0 && (i5 & 128) == 0) {
                        if (packageInfo.packageName.equals(j.f4963b)) {
                            sb.append(packageInfo.packageName);
                            sb.append(packageInfo.versionCode);
                            str2 = "-";
                        } else if (!packageInfo.packageName.contains("theme") && !packageInfo.packageName.startsWith("com.google.") && !packageInfo.packageName.startsWith("com.android.")) {
                            sb.append(packageInfo.packageName);
                            str2 = "-";
                        }
                        sb.append(str2);
                    }
                }
                String sb2 = sb.toString();
                com.alipay.sdk.app.statistic.a.c(com.alipay.sdk.app.statistic.c.f4729l, com.alipay.sdk.app.statistic.c.f4737t, u4 + "|" + u5 + "|" + sb2);
                return f4952h;
            }
            a aVar = this.f4957e;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f4953a.getRequestedOrientation() == 0) {
                this.f4953a.setRequestedOrientation(1);
                this.f4956d = true;
            }
            this.f4954b.registerCallback(this.f4959g);
            String Pay = this.f4954b.Pay(str);
            this.f4954b.unregisterCallback(this.f4959g);
            try {
                this.f4953a.unbindService(this.f4958f);
            } catch (Throwable unused2) {
            }
            this.f4959g = null;
            this.f4958f = null;
            this.f4954b = null;
            if (this.f4956d) {
                this.f4953a.setRequestedOrientation(0);
                this.f4956d = false;
            }
            return Pay;
        } catch (Throwable th) {
            try {
                com.alipay.sdk.app.statistic.a.d(com.alipay.sdk.app.statistic.c.f4729l, com.alipay.sdk.app.statistic.c.f4740w, th);
                try {
                    this.f4953a.unbindService(this.f4958f);
                } catch (Throwable unused3) {
                }
                this.f4959g = null;
                this.f4958f = null;
                this.f4954b = null;
                if (this.f4956d) {
                    this.f4953a.setRequestedOrientation(0);
                    this.f4956d = false;
                }
                return f4952h;
            } finally {
                try {
                    this.f4953a.unbindService(this.f4958f);
                } catch (Throwable unused4) {
                }
                this.f4959g = null;
                this.f4958f = null;
                this.f4954b = null;
                if (this.f4956d) {
                    this.f4953a.setRequestedOrientation(0);
                    this.f4956d = false;
                }
            }
        }
    }

    public final String c(String str) {
        j.a c5;
        String f5;
        try {
            c5 = j.c(this.f4953a, j.f4963b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (c5 != null && (f5 = j.f(c5.f4965a)) != null && !TextUtils.equals(f5, com.alipay.sdk.cons.a.f4819h)) {
            com.alipay.sdk.app.statistic.a.c(com.alipay.sdk.app.statistic.c.f4729l, com.alipay.sdk.app.statistic.c.f4736s, f5);
            return f4952h;
        }
        if (c5.f4966b > 78) {
            Intent intent = new Intent();
            intent.setClassName(j.f4963b, "com.alipay.android.app.TransProcessPayActivity");
            this.f4953a.startActivity(intent);
            Thread.sleep(150L);
        }
        Intent intent2 = new Intent();
        intent2.setPackage(j.f4963b);
        intent2.setAction("com.eg.android.AlipayGphone.IAlixPay");
        return d(str, intent2);
    }

    public final void e() {
        this.f4953a = null;
    }
}
