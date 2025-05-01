package com.cmic.sso.sdk.c;

import android.text.TextUtils;
import com.cmic.sso.sdk.c.b.d;
import com.cmic.sso.sdk.c.b.g;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.e.q;
import java.util.List;
import java.util.Map;
/* compiled from: RedirectHandler.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f9192a;

    /* renamed from: b  reason: collision with root package name */
    private String f9193b;

    public c a(c cVar, com.cmic.sso.sdk.c.d.b bVar, com.cmic.sso.sdk.a aVar) {
        List<String> list;
        Map<String, List<String>> b5 = bVar.b();
        if (TextUtils.isEmpty(this.f9192a) && (list = b5.get("pplocation")) != null && list.size() > 0) {
            this.f9192a = list.get(0);
        }
        q.b(aVar, String.valueOf(bVar.a()));
        List<String> list2 = b5.get("Location");
        if (list2 == null || list2.isEmpty()) {
            list2 = b5.get("Location".toLowerCase());
        }
        if (list2 != null && list2.size() > 0) {
            String str = list2.get(0);
            this.f9193b = str;
            if (!TextUtils.isEmpty(str)) {
                String b6 = aVar.b("operatortype", "0");
                if ("2".equals(b6)) {
                    q.a(aVar, "getUnicomMobile");
                } else if ("3".equals(b6)) {
                    q.a(aVar, "getTelecomMobile");
                } else {
                    q.a(aVar, "NONE");
                }
            }
        }
        c a5 = a(this.f9193b, cVar.f(), "GET", new com.cmic.sso.sdk.c.b.c(cVar.k().a()));
        a5.a(cVar.h());
        return a5;
    }

    public c b(c cVar, com.cmic.sso.sdk.c.d.b bVar, com.cmic.sso.sdk.a aVar) {
        String b5 = aVar.b("operatortype", "0");
        if ("2".equals(b5)) {
            q.a(aVar, "getNewUnicomPhoneNumberNotify");
        } else if ("3".equals(b5)) {
            q.a(aVar, "getNewTelecomPhoneNumberNotify");
        } else {
            q.a(aVar, "NONE");
        }
        q.b(aVar, String.valueOf(bVar.a()));
        d dVar = new d(cVar.k().a(), "1.0", bVar.c());
        dVar.c(aVar.b("userCapaid"));
        if (aVar.c("logintype") != 3) {
            dVar.b("authz");
        } else {
            dVar.b("pre");
        }
        c a5 = a(this.f9192a, cVar.f(), "POST", dVar);
        a5.a(cVar.h());
        this.f9192a = null;
        return a5;
    }

    private c a(String str, String str2, String str3, g gVar) {
        c cVar = new c(str, gVar, str3, str2);
        if (str3.equals("GET")) {
            cVar.a("Content-Type", "application/x-www-form-urlencoded");
        }
        return cVar;
    }

    public String a() {
        return this.f9192a;
    }
}
