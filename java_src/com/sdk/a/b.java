package com.sdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59921a = "com.sdk.a.b";

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f59922b = Boolean.valueOf(com.sdk.f.g.f60051b);

    /* renamed from: c  reason: collision with root package name */
    public static Network f59923c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f59924d;

    /* renamed from: e  reason: collision with root package name */
    public static ConnectivityManager.NetworkCallback f59925e;

    /* renamed from: f  reason: collision with root package name */
    public HttpURLConnection f59926f;

    /* renamed from: g  reason: collision with root package name */
    public ConnectivityManager f59927g;

    public b() {
    }

    public b(Context context, URL url) {
        this.f59927g = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            Network network = f59923c;
            if (network != null && !f59924d) {
                try {
                    this.f59926f = (HttpURLConnection) network.openConnection(url);
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            f59924d = false;
            a aVar = new a(this, url);
            f59925e = aVar;
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            ConnectivityManager connectivityManager = this.f59927g;
            if (connectivityManager != null) {
                connectivityManager.requestNetwork(build, aVar);
            }
        } catch (Exception e5) {
            com.sdk.o.b.a(f59921a, e5.toString(), f59922b);
        }
    }

    public HttpURLConnection a() {
        HttpURLConnection httpURLConnection;
        long currentTimeMillis = System.currentTimeMillis();
        do {
            if (System.currentTimeMillis() - currentTimeMillis > 2000) {
                return null;
            }
            httpURLConnection = this.f59926f;
        } while (httpURLConnection == null);
        return httpURLConnection;
    }
}
