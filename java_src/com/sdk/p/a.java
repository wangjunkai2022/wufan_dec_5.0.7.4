package com.sdk.p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.sdk.p.f;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60081a = "com.sdk.p.a";

    /* renamed from: b  reason: collision with root package name */
    public static final Boolean f60082b = Boolean.valueOf(com.sdk.f.g.f60051b);

    public static f.a a(Context context) {
        f.a aVar;
        f.a aVar2 = f.a.f60085c;
        if (context == null) {
            return aVar2;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return aVar2;
            }
            String typeName = activeNetworkInfo.getTypeName();
            if ("MOBILE".equalsIgnoreCase(typeName)) {
                aVar = f.a.f60084b;
            } else if (!"WIFI".equalsIgnoreCase(typeName)) {
                return aVar2;
            } else {
                aVar = f.a.f60083a;
            }
            return aVar;
        } catch (Throwable th) {
            com.sdk.o.b.a(f60081a, th.getMessage(), f60082b);
            return aVar2;
        }
    }
}
