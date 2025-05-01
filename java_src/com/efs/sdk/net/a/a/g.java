package com.efs.sdk.net.a.a;

import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.net.a.a.f;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f10580a = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static g f10581c;

    /* renamed from: b  reason: collision with root package name */
    private b f10582b = new b();

    private g() {
    }

    public static g c() {
        if (f10581c == null) {
            f10581c = new g();
        }
        return f10581c;
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.b bVar) {
        String str;
        Log.d("NetTrace-Interceptor", "request will be sent");
        b bVar2 = this.f10582b;
        try {
            String a5 = bVar.a();
            bVar2.f10571a.put(bVar.a(), Long.valueOf(System.currentTimeMillis()));
            Log.i("NetTrace-Interceptor", "save request");
            com.efs.sdk.net.a.c a6 = com.efs.sdk.net.a.a.a().a(a5);
            String b5 = bVar.b();
            if (!TextUtils.isEmpty(b5)) {
                a6.f10594d = b5;
            }
            a6.f10595e = bVar.c();
            HashMap hashMap = new HashMap();
            int e5 = bVar.e();
            for (int i4 = 0; i4 < e5; i4++) {
                hashMap.put(bVar.a(i4), bVar.b(i4));
            }
            a6.f10596f = b.a(bVar);
            if (NetManager.getNetConfigManager().getNetRequestBodyCollectState()) {
                String str2 = a6.f10595e;
                if ((str2 == null || !str2.equalsIgnoreCase("get")) && (str = a6.f10595e) != null && str.equalsIgnoreCase("post") && a6.f10596f < 10240) {
                    if (hashMap.containsKey("Content-Type") || hashMap.containsKey(com.alipay.sdk.packet.d.f4897f)) {
                        String str3 = (String) hashMap.get("Content-Type");
                        if (TextUtils.isEmpty(str3)) {
                            str3 = (String) hashMap.get(com.alipay.sdk.packet.d.f4897f);
                        }
                        if (str3 != null) {
                            if (str3.contains(HttpHeaders.Values.APPLICATION_JSON) || str3.contains("application/x-www-form-urlencoded")) {
                                a6.f10597g = new String(bVar.d());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    public final String b() {
        Log.d("NetTrace-Interceptor", "next request id");
        return String.valueOf(f10580a.getAndIncrement());
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.d dVar) {
        Log.d("NetTrace-Interceptor", "response headers received");
        b bVar = this.f10582b;
        Log.i("NetTrace-Interceptor", "save response");
        String a5 = dVar.a();
        if (bVar.f10571a != null) {
            com.efs.sdk.net.a.a.a().a(a5).f10598h = dVar.b();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    @Nullable
    public final InputStream a(String str, @Nullable String str2, @Nullable String str3, @Nullable InputStream inputStream) {
        Log.d("NetTrace-Interceptor", "interpret response stream");
        return b.a(str, str2, str3, inputStream);
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a() {
        Log.d("NetTrace-Interceptor", "data sent");
    }
}
