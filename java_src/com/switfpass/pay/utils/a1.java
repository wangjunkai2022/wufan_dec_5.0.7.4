package com.switfpass.pay.utils;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
/* loaded from: classes5.dex */
final class a1 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLContext f61829a;

    public a1(KeyStore keyStore) {
        super(keyStore);
        this.f61829a = SSLContext.getInstance(SSLConnectionSocketFactory.TLS);
        this.f61829a.init(null, new TrustManager[]{new b1()}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return this.f61829a.getSocketFactory().createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public final Socket createSocket(Socket socket, String str, int i4, boolean z4) {
        return this.f61829a.getSocketFactory().createSocket(socket, str, i4, z4);
    }
}
