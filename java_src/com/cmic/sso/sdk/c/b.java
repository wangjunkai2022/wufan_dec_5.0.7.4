package com.cmic.sso.sdk.c;

import com.cmic.sso.sdk.e.c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: Tls12SocketFactory.java */
/* loaded from: classes2.dex */
public class b extends SSLSocketFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f9211b = {"TLSv1.2"};

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f9212a;

    public b(SSLSocketFactory sSLSocketFactory) {
        this.f9212a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            for (String str : sSLSocket.getEnabledProtocols()) {
                c.a("enableProtocol", str);
            }
            sSLSocket.setEnabledProtocols(f9211b);
            sSLSocket.setEnabledCipherSuites(new String[]{"TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return a(this.f9212a.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f9212a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f9212a.getSupportedCipherSuites();
    }

    public String toString() {
        return "Tls12SocketFactory";
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i4, boolean z4) throws IOException {
        return a(this.f9212a.createSocket(socket, str, i4, z4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4) throws IOException {
        return a(this.f9212a.createSocket(str, i4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) throws IOException {
        return a(this.f9212a.createSocket(str, i4, inetAddress, i5));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4) throws IOException {
        return a(this.f9212a.createSocket(inetAddress, i4));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) throws IOException {
        return a(this.f9212a.createSocket(inetAddress, i4, inetAddress2, i5));
    }
}
