package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.util.f;
import com.alipay.sdk.util.j;
import java.io.IOException;
import java.util.List;
/* loaded from: classes2.dex */
public class AuthTask {

    /* renamed from: c  reason: collision with root package name */
    private static final int f4683c = 73;

    /* renamed from: d  reason: collision with root package name */
    static final Object f4684d = com.alipay.sdk.util.f.class;

    /* renamed from: a  reason: collision with root package name */
    private Activity f4685a;

    /* renamed from: b  reason: collision with root package name */
    private com.alipay.sdk.widget.a f4686b;

    public AuthTask(Activity activity) {
        this.f4685a = activity;
        m.b b5 = m.b.b();
        Activity activity2 = this.f4685a;
        com.alipay.sdk.data.c.a();
        b5.c(activity2);
        com.alipay.sdk.app.statistic.a.a(activity);
        this.f4686b = new com.alipay.sdk.widget.a(activity, com.alipay.sdk.widget.a.f4971f);
    }

    private f.a a() {
        return new a(this);
    }

    private String b(Activity activity, String str) {
        String a5 = new m.a(this.f4685a).a(str);
        if (e(activity)) {
            String c5 = new com.alipay.sdk.util.f(activity, new a(this)).c(a5);
            if (TextUtils.equals(c5, com.alipay.sdk.util.f.f4952h)) {
                return f(activity, a5);
            }
            return TextUtils.isEmpty(c5) ? h.a() : c5;
        }
        return f(activity, a5);
    }

    private String c(com.alipay.sdk.protocol.b bVar) {
        String[] strArr = bVar.f4924c;
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        Intent intent = new Intent(this.f4685a, H5AuthActivity.class);
        intent.putExtras(bundle);
        this.f4685a.startActivity(intent);
        Object obj = f4684d;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return h.a();
            }
        }
        String str = h.f4713a;
        return TextUtils.isEmpty(str) ? h.a() : str;
    }

    private static boolean e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(j.f4963b, 128);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 73;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private String f(Activity activity, String str) {
        i iVar;
        g();
        try {
            try {
                List<com.alipay.sdk.protocol.b> b5 = com.alipay.sdk.protocol.b.b(new com.alipay.sdk.packet.impl.a().b(activity, str).a().optJSONObject(com.alipay.sdk.cons.c.f4840c).optJSONObject(com.alipay.sdk.cons.c.f4841d));
                h();
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    if (b5.get(i4).f4922a == com.alipay.sdk.protocol.a.WapPay) {
                        String c5 = c(b5.get(i4));
                        h();
                        return c5;
                    }
                }
                h();
                iVar = null;
            } catch (IOException e5) {
                i a5 = i.a(i.NETWORK_ERROR.a());
                com.alipay.sdk.app.statistic.a.e("net", e5);
                h();
                iVar = a5;
            }
            if (iVar == null) {
                iVar = i.a(i.FAILED.a());
            }
            return h.b(iVar.a(), iVar.b(), "");
        }
    }

    private void g() {
        com.alipay.sdk.widget.a aVar = this.f4686b;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.alipay.sdk.widget.a aVar = this.f4686b;
        if (aVar != null) {
            aVar.f();
        }
    }

    public synchronized String auth(String str, boolean z4) {
        String a5;
        Activity activity;
        Activity activity2;
        String a6;
        if (z4) {
            g();
        }
        m.b b5 = m.b.b();
        Activity activity3 = this.f4685a;
        com.alipay.sdk.data.c.a();
        b5.c(activity3);
        a5 = h.a();
        try {
            activity2 = this.f4685a;
            a6 = new m.a(activity2).a(str);
        } catch (Exception unused) {
            com.alipay.sdk.data.a.f().b(this.f4685a);
            h();
            activity = this.f4685a;
        } catch (Throwable th) {
            com.alipay.sdk.data.a.f().b(this.f4685a);
            h();
            com.alipay.sdk.app.statistic.a.b(this.f4685a, str);
            throw th;
        }
        if (e(activity2)) {
            String c5 = new com.alipay.sdk.util.f(activity2, new a(this)).c(a6);
            if (!TextUtils.equals(c5, com.alipay.sdk.util.f.f4952h)) {
                a5 = TextUtils.isEmpty(c5) ? h.a() : c5;
                com.alipay.sdk.data.a.f().b(this.f4685a);
                h();
                activity = this.f4685a;
                com.alipay.sdk.app.statistic.a.b(activity, str);
            }
        }
        a5 = f(activity2, a6);
        com.alipay.sdk.data.a.f().b(this.f4685a);
        h();
        activity = this.f4685a;
        com.alipay.sdk.app.statistic.a.b(activity, str);
        return a5;
    }
}
