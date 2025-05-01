package com.switfpass.pay.thread;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
/* loaded from: classes5.dex */
public class c extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLContext f61800a;

    public c(KeyStore keyStore) {
        super(keyStore);
        this.f61800a = SSLContext.getInstance(SSLConnectionSocketFactory.TLS);
        this.f61800a.init(null, new TrustManager[]{new i()}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f61800a.getSocketFactory().createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z4) {
        return this.f61800a.getSocketFactory().createSocket(socket, str, i4, z4);
    }
}
