package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import com.cmic.sso.sdk.b;
import com.cmic.sso.sdk.e.l;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: AuthnBusiness.java */
/* loaded from: classes2.dex */
public class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static a f9140c;

    /* renamed from: a  reason: collision with root package name */
    private final com.cmic.sso.sdk.c.c.a f9141a = com.cmic.sso.sdk.c.c.a.a();

    /* renamed from: b  reason: collision with root package name */
    private final Context f9142b;

    private a(Context context) {
        this.f9142b = context.getApplicationContext();
    }

    public void b(final com.cmic.sso.sdk.a aVar, final b bVar) {
        com.cmic.sso.sdk.e.c.b("AuthnBusiness", "getScripAndToken start");
        a(aVar);
        if (!aVar.b("isCacheScrip", false)) {
            b(aVar);
        }
        if (aVar.c("logintype") == 1) {
            aVar.a("userCapaid", "200");
        } else if (aVar.c("logintype") == 0) {
            aVar.a("userCapaid", "50");
        }
        this.f9141a.a(aVar, new com.cmic.sso.sdk.c.c.d() { // from class: com.cmic.sso.sdk.auth.a.1
            @Override // com.cmic.sso.sdk.c.c.d
            public void a(String str, String str2, JSONObject jSONObject) {
                a.this.a(aVar, bVar, str, str2, jSONObject);
            }
        });
    }

    public static a a(Context context) {
        if (f9140c == null) {
            synchronized (a.class) {
                if (f9140c == null) {
                    f9140c = new a(context);
                }
            }
        }
        return f9140c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.cmic.sso.sdk.a aVar, b bVar) {
        com.cmic.sso.sdk.e.c.b("AuthnBusiness", "LoginCheck method start");
        int c5 = aVar.c("logintype");
        if (aVar.b("isCacheScrip", false)) {
            String b5 = aVar.b("securityphone", "");
            if (c5 == 3) {
                bVar.a("103000", "true", aVar, d.a(b5));
                return;
            } else {
                b(aVar, bVar);
                return;
            }
        }
        b(aVar, bVar);
    }

    private void b(com.cmic.sso.sdk.a aVar) {
        byte[] bArr = new byte[0];
        if (aVar.b("use2048PublicKey", false)) {
            com.cmic.sso.sdk.e.c.a("AuthnBusiness", "使用2048公钥对应的对称秘钥生成方式");
            bArr = com.cmic.sso.sdk.e.a.a();
        } else {
            com.cmic.sso.sdk.e.c.a("AuthnBusiness", "使用1024公钥对应的对称秘钥生成方式");
            try {
                bArr = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        byte[] a5 = com.cmic.sso.sdk.e.a.a();
        aVar.a(b.a.f9181a, bArr);
        aVar.a(b.a.f9182b, a5);
        aVar.a("authType", "3");
    }

    private void a(com.cmic.sso.sdk.a aVar) {
        String packageName = this.f9142b.getPackageName();
        String a5 = com.cmic.sso.sdk.e.d.a(l.a(this.f9142b, packageName));
        aVar.a("apppackage", packageName);
        aVar.a("appsign", a5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.cmic.sso.sdk.a r21, com.cmic.sso.sdk.auth.b r22, java.lang.String r23, java.lang.String r24, org.json.JSONObject r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.auth.a.a(com.cmic.sso.sdk.a, com.cmic.sso.sdk.auth.b, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
