package com.sdk.u;

import android.content.Context;
import android.net.ConnectivityManager;
import com.join.mgps.dto.Constant;
import com.sdk.f.g;
import com.sdk.o.c;
import com.sdk.q.b;
import com.sdk.r.f;
import com.umeng.analytics.pro.aw;
import java.util.TreeMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60102a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f60103b;

    static {
        new TreeMap();
        f60102a = a.class.getSimpleName();
        f60103b = Boolean.valueOf(g.f60051b);
    }

    public static String a(String str) {
        String optString;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("aesKey");
            String optString3 = jSONObject.optString("data");
            String optString4 = jSONObject.optString(Constant.MD5);
            if (com.sdk.v.a.f60107d == 0) {
                optString = b.a(optString2, com.sdk.v.a.f60105b);
            } else {
                optString = jSONObject.optString("key");
                f a5 = f.a();
                String a6 = a5.f60100b.a(a5.f60101c, optString, optString, optString4);
                if (com.sdk.o.b.a(a6).booleanValue() && !Boolean.parseBoolean(a6)) {
                    return null;
                }
            }
            return f.a().f60100b.b(optString, optString3);
        } catch (Throwable th) {
            c.b(th.toString());
            String str2 = f60102a;
            com.sdk.o.b.a(str2, "SDK解密异常：" + th.toString(), f60103b);
            return null;
        }
    }

    public static void a() {
    }

    public static boolean b(String str) {
        try {
            return new JSONObject(str).optLong(aw.f63371b) < System.currentTimeMillis();
        } catch (Exception e5) {
            String str2 = f60102a;
            com.sdk.o.b.c(str2, "out data error" + e5, f60103b);
            return true;
        }
    }

    public static void a(Context context) {
        ConnectivityManager.NetworkCallback networkCallback;
        com.sdk.a.b bVar = new com.sdk.a.b();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        bVar.f59927g = connectivityManager;
        if (connectivityManager == null || (networkCallback = com.sdk.a.b.f59925e) == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(networkCallback);
        com.sdk.a.b.f59924d = true;
        com.sdk.a.b.f59925e = null;
    }
}
