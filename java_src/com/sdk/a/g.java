package com.sdk.a;

import android.content.Context;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import org.apache.http.client.methods.HttpDeleteHC4;
import org.apache.http.client.methods.HttpHeadHC4;
import org.apache.http.client.methods.HttpOptionsHC4;
import org.apache.http.client.methods.HttpPutHC4;
import org.apache.http.client.methods.HttpTraceHC4;
/* loaded from: classes5.dex */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59956a = "g";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f59957b = com.sdk.f.g.f60051b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f59958c = UUID.randomUUID().toString();

    /* renamed from: d  reason: collision with root package name */
    public static final HostnameVerifier f59959d = new f();

    /* renamed from: e  reason: collision with root package name */
    public Context f59960e;

    /* renamed from: f  reason: collision with root package name */
    public h<T> f59961f;

    /* loaded from: classes5.dex */
    public enum a {
        GET("GET"),
        POST("POST"),
        PUT(HttpPutHC4.METHOD_NAME),
        HEAD(HttpHeadHC4.METHOD_NAME),
        MOVE("MOVE"),
        COPY("COPY"),
        DELETE(HttpDeleteHC4.METHOD_NAME),
        OPTIONS(HttpOptionsHC4.METHOD_NAME),
        TRACE(HttpTraceHC4.METHOD_NAME),
        CONNECT("CONNECT");
        

        /* renamed from: l  reason: collision with root package name */
        public final String f59973l;

        a(String str) {
            this.f59973l = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f59973l;
        }
    }

    public g(Context context, h<T> hVar) {
        this.f59960e = context;
        this.f59961f = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @android.annotation.SuppressLint({"DefaultLocale"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.HttpURLConnection a(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sdk.a.g.a(java.lang.String, boolean):java.net.HttpURLConnection");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.HttpURLConnection a(java.net.HttpURLConnection r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sdk.a.g.a(java.net.HttpURLConnection):java.net.HttpURLConnection");
    }

    public String a() {
        StringBuilder sb;
        try {
            h<T> hVar = this.f59961f;
            if (hVar != null) {
                String str = hVar.f59976c;
                String str2 = hVar.f59977d;
                if (str.equals(a.GET.f59973l)) {
                    h<T> hVar2 = this.f59961f;
                    String a5 = hVar2.a(hVar2.f59979f);
                    if (!com.sdk.o.b.b(a5).booleanValue()) {
                        return str2;
                    }
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("?");
                    sb.append(a5);
                } else {
                    String str3 = this.f59961f.f59978e;
                    if (!com.sdk.o.b.b(str3).booleanValue()) {
                        return str2;
                    }
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("?unikey=");
                    sb.append(str3);
                }
                return sb.toString();
            }
            return null;
        } catch (Exception e5) {
            com.sdk.o.b.a(f59956a, e5.getMessage(), Boolean.valueOf(f59957b));
            return null;
        }
    }

    public final boolean a(String str) {
        return (!SDKManager.isStrong || str.contains("/api/netm/v1.0/qhbt") || str.contains("/api/netm/v1.0/qhbv") || str.contains("/st/api/v1.0/ses")) ? false : true;
    }
}
