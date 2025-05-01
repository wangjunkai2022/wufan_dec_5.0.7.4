package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.security.mobile.module.commonutils.crypto.d;
import java.util.UUID;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f4659a = "";

    public static synchronized String a(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (b.class) {
            if (com.alipay.security.mobile.module.commonutils.a.b(f4659a)) {
                String a5 = s.c.a(context, "alipay_vkey_random", "random", "");
                f4659a = a5;
                if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
                    String a6 = d.a(UUID.randomUUID().toString());
                    f4659a = a6;
                    if (a6 != null && (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        edit.clear();
                        edit.putString("random", a6);
                        edit.commit();
                    }
                }
            }
            str = f4659a;
        }
        return str;
    }
}
